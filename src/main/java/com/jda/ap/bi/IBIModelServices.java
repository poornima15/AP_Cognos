package com.jda.ap.bi;

import com.jda.ap.bi.cognos.config.CognosServiceConfig;
import com.jda.ap.bi.cognos.exception.FrameworkManagerException;
import com.jda.ap.bi.enums.ModelCommandEnum;
import com.jda.ap.bi.enums.ScriptPlaceholderEnum;
import com.jda.ap.bi.modeller.Modeller;
import com.jda.ap.exception.BIConfigException;

import java.io.File;
import java.util.Map;

/**
 * User: Lee
 * Date: 7/28/2014
 * Time: 12:21 PM
 */
public interface IBIModelServices
{
    /**
     * Connect to the BI service
     * @return
     * @throws FrameworkManagerException
     */
    public abstract String connectToService() throws FrameworkManagerException;


    /**
     * Build the model from the AP dataset
     * @return
     * @throws FrameworkManagerException
     * @throws BIConfigException
     */
    public  String buildModel() throws FrameworkManagerException, BIConfigException;

    /**
     * Check if the model exists based on the config folder and filename
     * @return
     * @throws BIConfigException
     */
    public boolean isModelExists() throws BIConfigException;

    /**
     * publish the model
     * @return
     * @throws FrameworkManagerException
     * @throws BIConfigException
     */
    public  String publishModel() throws FrameworkManagerException, BIConfigException;

    /**
     * Save configuration changes
     * @throws BIConfigException
     */
    public String saveConfig() throws BIConfigException;


    /**
     * Get the configuration
     * @return
     * @throws BIConfigException
     */
    public CognosServiceConfig getConfig() throws BIConfigException;

    /**
     * Get the configuration file
     * @return
     * @throws BIConfigException if file does not exist or is not readable
     */
    public File getConfigFile() throws BIConfigException;


    /**
     * Create a new model
     * @param model - the model XML location
     * @return
     * @throws FrameworkManagerException
     */
    public String createNewModel(String model) throws FrameworkManagerException ;


    /**
     * For a particular command (listed in the enum) this will create the transaction request
     * by wrapping it in the appropriate mdprovider tags and then replace placeholders in the stored script
     * with the values provided in the value map.
     *
     * @param command
     * @param valueMap key-value pairs that map to placeholders in the appropriate script file (e.g. ~~PACKAGE_NAME~~)
     * @return
     * @throws FrameworkManagerException
     */
    public String submitRequest(ModelCommandEnum command, Map<ScriptPlaceholderEnum,String> valueMap) throws FrameworkManagerException;


    /**
     * Returns a list of all known packages
     * @return
     * @throws FrameworkManagerException
     */
    public Map<String,String> listPackages() throws FrameworkManagerException;

    /**
     * Create a datasource
     * @param dataSourceName
     * @param dataSourceConnectionString
     * @throws Exception
     */
    public void createDataSource(String dataSourceName,
                                 String dataSourceConnectionString) throws Exception;


    /**
     * List data sources and connections
     * @return
     * @throws Exception
     */
    public Map<String,String> listDataSourcesAndConnections() throws Exception ;


    /**
     * Create and save the model
     * @param modelFile
     * @throws FrameworkManagerException
     */
    public void createAndSaveProject(File modelFile) throws FrameworkManagerException;

    public Modeller getModeller();
}
