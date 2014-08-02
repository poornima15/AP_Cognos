package com.jda.ap.bi.cognos.config;


import com.jda.ap.bi.bind.APBIConfig;
import com.jda.ap.bi.bind.View;
import com.jda.ap.bi.bind.Views;
import com.jda.ap.bi.cognos.exception.BIConfigException;
import com.jda.ap.bi.config.ConfigUtil;
import com.jda.ap.bi.exception.ViewNotFoundException;
import com.jda.ap.reporting.enums.ViewTypeEnum;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.logging.Logger;

/**
 * User: Lee
 * Date: 7/1/2014
 * Time: 3:31 PM
 * This file contains all of the login/config information for connecting to various services
 */
public final class CognosServiceConfig implements IServiceConfig
{
    private static final Logger log = Logger.getLogger(CognosServiceConfig.class.getName());

    private static CognosServiceConfig ourInstance = new CognosServiceConfig();
    private APBIConfig _config;
    private File configFolder = null;
    private String configPath;
    private File modelFile = null;
    private File modelFolder = null;

    private File loadedConfigurationFile = null;

    private CognosServiceConfig()
    {
    }

    public static CognosServiceConfig getInstance()
    {
        return ourInstance;
    }


    public static CognosServiceConfig getOurInstance()
    {
        return ourInstance;
    }

    public static void setOurInstance(CognosServiceConfig ourInstance)
    {
        CognosServiceConfig.ourInstance = ourInstance;
    }

    /**
     * @return
     */
    public APBIConfig getServiceConfig()
    {
        return _config;
    }

    public void setConfigFromFile(APBIConfig configFromFile)
    {
        _config = configFromFile;
    }

    public String getConfigPath()
    {
        return configPath;
    }

    /**
     * Sets the config path from the params and loads any configuration files
     *
     * @param _configPath
     * @throws com.jda.ap.bi.cognos.exception.BIConfigException
     */
    public void setConfigPath(String _configPath) throws BIConfigException
    {
        // check path exists
        File configFolder = new File(_configPath);
        if (!configFolder.exists())
        {
            throw new BIConfigException("The config folder is not found");
        }

        if (!configFolder.isDirectory())
        {
            throw new BIConfigException("The config parameter is not a folder");
        }

        loadConfig(configFolder);

        this.configFolder = configFolder;
        this.configPath = _configPath;
    }


    /**
     * Load any configuration files in the folder
     *
     * @param configFolder
     * @throws com.jda.ap.bi.cognos.exception.BIConfigException
     */
    private void loadConfig(File configFolder) throws BIConfigException
    {
        log.info("Looking for config XML file...");
        FilenameFilter filter = new FilenameFilter()
        {
            public boolean accept(File dir, String name)
            {
                return name.endsWith(".xml");
            }
        };
        // potential files
        File[] xmlFiles = configFolder.listFiles(filter);

        for (File xmlFile : xmlFiles)
        {
            try
            {
                _config = getConfigTypeFromFile(xmlFile);
                // store the file we used for config
                loadedConfigurationFile = xmlFile;
                // set the model folder from the config file
                modelFile = new File(_config.getBI().getCognos().getModelFolder() + System.getProperty("file.separator") + _config.getBI().getCognos().getModelFile());
                // set the model file
                modelFolder = modelFile.getParentFile();
                log.info("Using configuration from XML file: " + xmlFile.getAbsolutePath());
                break;
            }
            catch (JAXBException e)
            {
                log.warning("Skipping invalid config XML file " + xmlFile.getName());
            }
        }
    }

    /**
     * Attempt to un-marshall the XML file to an JAXB object
     *
     * @param inputFile
     * @return
     * @throws javax.xml.bind.JAXBException
     */
    private APBIConfig getConfigTypeFromFile(File inputFile) throws JAXBException
    {
        JAXBContext jc = JAXBContext.newInstance(APBIConfig.class);
        Unmarshaller u = jc.createUnmarshaller();
        return (APBIConfig) u.unmarshal(inputFile);

    }

    public File getConfigFolder()
    {
        return configFolder;
    }

    public void setConfigFolder(File configFolder)
    {
        this.configFolder = configFolder;
    }


    /**
     * Load the config file from the config folder
     *
     * @throws com.jda.ap.bi.cognos.exception.BIConfigException
     */
    public void loadFromConfigFolder(File configFolder) throws BIConfigException
    {
        setConfigPath(configFolder.getAbsolutePath());
    }


    public String getModelFolderStr()
    {
        return _config.getBI().getCognos().getModelFolder();
    }

    public void setModelFolder(String _modelFolder) throws BIConfigException
    {

        this.modelFolder = new File(_modelFolder);
        if (!modelFolder.exists())
        {
            if (modelFolder.mkdirs())
            {
                log.info("Created new model folder: " + _modelFolder);
            }
            else
            {
                throw new BIConfigException("Failed to create model folder - check parent folder for permissions");

            }
        }
        if (!modelFolder.canWrite())
        {
            throw new BIConfigException("Model folder is not writable - check permissions");
        }

    }

    public File getModelFolder()
    {
        return modelFolder;
    }

    /**
     * Get the file used for modelling
     *
     * @return
     */
    @Override
    public File getModelFile()
    {
        return modelFile;
    }

    /**
     * Get all views
     *
     * @return
     */
    @Override
    public Map<ViewTypeEnum, List<View>> getAllViews()
    {
        Map<ViewTypeEnum, List<View>> returnList = new HashMap<>();

        Views views = _config.getViews();
        // get all views based on type
        returnList.put(ViewTypeEnum.ATTRIBUTE, views.getAttributeViews().getView());
        returnList.put(ViewTypeEnum.HIERARCHY, views.getHierarchyViews().getView());
        returnList.put(ViewTypeEnum.PLAN, views.getPlanViews().getView());

        return returnList;
    }

    /**
     * From a config form save the data to the Config XML
     *
     * @param type
     * @param formParams
     */
    @Override
    public void setConfigFromForm(ViewTypeEnum type, Set<Map.Entry<String, List<String>>> formParams) throws BIConfigException
    {

        log.info("Saving form data...");
        Iterator<Map.Entry<String, List<String>>> formParamIter = formParams.iterator();
        ConfigUtil configUtil = ConfigUtil.getInstance(this);


        while (formParamIter.hasNext())
        {
            Map.Entry<String, List<String>> entry = formParamIter.next();
            // handle alias requests
            if (entry.getKey().indexOf("alias__") != -1)
            {
                String viewName = entry.getKey().replace("alias__", "");
                // just get the first entry
                String alias = entry.getValue().get(0);
                log.info("Processing: " + viewName);
                // see if we have a view with this name
                try
                {
                    View view = configUtil.getAttributeView(viewName);
                    view.setAlias(alias);
                }
                catch (ViewNotFoundException e)
                {
                    // this just means the config doesnt include this element
                    // so we'll add it
                    configUtil.addView(type, viewName, alias);
                }
            }


        }


    }

    /**
     * Get the file that was used to load the configuration
     *
     * @return
     */
    public File getLoadedConfigurationFile()
    {
        return loadedConfigurationFile;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("CognosServiceConfig{");
        sb.append("_config=").append(_config);
        sb.append(", configFolder=").append(configFolder);
        sb.append(", configPath='").append(configPath).append('\'');
        sb.append(", modelFolder=").append(modelFolder);
        sb.append('}');
        return sb.toString();
    }


}
