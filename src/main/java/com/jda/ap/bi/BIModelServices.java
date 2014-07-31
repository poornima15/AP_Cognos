package com.jda.ap.bi;

import com.jda.ap.bi.bind.APBIConfig;
import com.jda.ap.bi.cognos.config.CognosServiceConfig;
import com.jda.ap.bi.cognos.config.IServiceConfig;
import com.jda.ap.bi.cognos.exception.BIConfigException;
import com.jda.ap.bi.cognos.exception.FrameworkManagerException;
import com.jda.ap.bi.modeller.Modeller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Created by Lee on 7/23/2014.
 */

/**
 * BIModelServices.java
 * <p/>
 * Licensed Material - Property of JDA Software
 * © Copyright JDA. 2014
 * <p/>
 * Description:
 * <p/>
 * Tested with: IBM Cognos BI 10.2.1, Java 7.0
 */
public abstract class BIModelServices implements IBIModelServices
{
    protected static IServiceConfig _config = null;
    private static final Logger log = Logger.getLogger(BIModelServices.class.getName());
    private static Modeller _modeller = null;


    protected BIModelServices(IServiceConfig config)
    {
        _config = config;
    }

    protected BIModelServices(File configFile)
    {
        log.info("Loading config from file: " + configFile);
        CognosServiceConfig cognosServiceConfig = CognosServiceConfig.getInstance();
        // look for config in config folder
        try
        {
            cognosServiceConfig.loadFromConfigFolder(configFile);
            _config = cognosServiceConfig;
        }
        catch (BIConfigException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Connect to the BI service
     *
     * @return
     * @throws FrameworkManagerException
     */
    public abstract String connectToService() throws FrameworkManagerException;

    /**
     * Refresh request - this is used if for example the service URL changes
     *
     * @return
     * @throws FrameworkManagerException
     */
    public abstract void refreshConnectionInfo() throws FrameworkManagerException;


    /**
     * Build the model from the AP dataset
     *
     * @return
     * @throws FrameworkManagerException
     * @throws BIConfigException
     */
    public abstract String buildModel() throws FrameworkManagerException, BIConfigException;


    /**
     * publish the model
     *
     * @return
     * @throws FrameworkManagerException
     * @throws BIConfigException
     */
    public abstract String publishModel() throws FrameworkManagerException, BIConfigException;

    /**
     * Save configuration changes
     *
     * @throws BIConfigException
     */
    public String saveConfig() throws BIConfigException
    {

        StringBuilder responseString = new StringBuilder();
        if (_config == null)
        {
            throw new BIConfigException("Configuration is not set");
        }

        // validate the configuration
        if (_config.getServiceConfig().getBI().getCognos().getModelFolder() == null)
        {
            throw new BIConfigException("No model folder specified");
        }

        try
        {

            // check and create model output folder if it does not exist
            File modelFolder = new File(_config.getServiceConfig().getBI().getCognos().getModelFolder());
            if (!modelFolder.exists())
            {
                log.info("Model folder does not exist - creating...");
                if (modelFolder.mkdirs())
                {
                    log.info("...created");
                    responseString.append("Setup folder created [").append(modelFolder.getAbsolutePath()).append("]\n");
                }
                else
                {
                    throw new BIConfigException("Failed to create model folder: " + modelFolder.getAbsolutePath() + " - check permissions");
                }
            }
            else
            {
                if (!modelFolder.canWrite())
                {
                    throw new BIConfigException("Model folder exists but you do not have write access to it: " + modelFolder.getAbsolutePath());

                }
                else
                {
                    responseString.append("Model folder already exists [").append(modelFolder.getAbsolutePath()).append("]\n");

                }
            }


            File configFile = null;
            if (getConfig().getLoadedConfigurationFile() == null)
            {
                // set default config file
                configFile = new File(getConfig().getConfigPath() + System.getProperty("file.separator") + "APBIConfig.xml");
            }
            else
            {
                configFile = getConfig().getLoadedConfigurationFile();
            }
            if (configFile.exists() && !configFile.canWrite())
            {
                throw new BIConfigException("Unable to write to configuration file - check permissions and make sure it is not open");
            }
            // backup the file if it exists
            if (configFile.exists())
            {
                backupFile(configFile);
            }
            // marshall the object back to XML
            JAXBContext jc = JAXBContext.newInstance(APBIConfig.class);
            Marshaller marshaller = jc.createMarshaller();
            // pretty print
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            responseString.append("Config written to [").append(configFile.getAbsolutePath()).append("]\n");

            // replace original file if it exists
            FileWriter fileWriter = new FileWriter(configFile);
            // do the actual marshalling
            marshaller.marshal(getConfig().getServiceConfig(), fileWriter);

            log.info("BI username: " + _config.getServiceConfig().getBI().getCognos().getUsername());
            log.info("Saving config: " + _config.toString());
            // refresh the connection info
            responseString.append("Service connection info refreshed.\n");

            refreshConnectionInfo();
        }
        catch (JAXBException e)
        {
            throw new BIConfigException("Failed to generate XML for config", e);
        }
        catch (IOException e)
        {
            throw new BIConfigException("Failed to save configuration", e);
        }
        catch (FrameworkManagerException e)
        {
            throw new BIConfigException("Failed to save configuration", e);

        }

        return responseString.toString();
    }


    /**
     * Get the configuration
     *
     * @return
     * @throws BIConfigException
     */
    public CognosServiceConfig getConfig() throws BIConfigException
    {
        return CognosServiceConfig.getInstance();
    }


    /**
     * Copy the file to a backup folder
     *
     * @param input
     * @throws IOException
     * @todo Move to a helper package
     */
    private void backupFile(File input) throws IOException
    {
        Path source = Paths.get(input.getAbsolutePath());
        String sourcePath = input.getParent();
        String targetPath = sourcePath + System.getProperty("file.separator") + "backup";
        File targetFolder = new File(targetPath);
        if (!targetFolder.exists())
        {
            log.info("Creating backup folder: " + targetPath);
            Files.createDirectories(Paths.get(targetPath));
        }
        Path target = Paths.get(targetPath + System.getProperty("file.separator") + input.getName());
        Files.copy(source, target, REPLACE_EXISTING);
    }


    /**
     * @return
     * @throws BIConfigException
     */
    public File getConfigFile() throws BIConfigException
    {
        if (getConfig().getLoadedConfigurationFile() == null)
        {
            throw new BIConfigException("Unable to access configuration file");
        }

        return getConfig().getLoadedConfigurationFile();
    }

    /**
     * Create a new model
     *
     * @param model
     * @return
     * @throws FrameworkManagerException
     */
    public abstract String createNewModel(String model) throws FrameworkManagerException;


    /**
     * Get a JAXB object as a string (useful for debugging)
     *
     * @param pContext
     * @param pObject
     * @return
     * @throws JAXBException
     */
    public String getJAXBAsString(JAXBContext pContext,
                                  Object pObject)
            throws
            JAXBException
    {

        java.io.StringWriter sw = new StringWriter();

        Marshaller marshaller = pContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.marshal(pObject, sw);

        return sw.toString();
    }


    /**
     * Get the modeller class
     * @return
     */
    public Modeller getModeller() {
         return Modeller.getInstance(_config);
    }


}
