package com.jda.ap.bi.cognos.config;

import com.jda.ap.bi.bind.APBIConfig;
import com.jda.ap.bi.bind.View;
import com.jda.ap.bi.cognos.exception.BIConfigException;
import com.jda.ap.reporting.enums.ViewTypeEnum;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * User: Lee
 * Date: 7/28/2014
 * Time: 1:24 PM
 */
public interface IServiceConfig
{
    /**
     * Get the configuration service
     * @return
     */
    public APBIConfig getServiceConfig();

    /**
     * Get the folder where the model resides
     * @return
     */
    public File getModelFolder();

    /**
     * Get the file used for modelling
     * @return
     */
    public File getModelFile();


    /**
     * Get all views
     * @return
     */
    public Map<ViewTypeEnum,List<View>> getAllViews();



    /**
     * From a config form save the data to the Config XML
     * @param type
     * @param formParams
     */
    public void setConfigFromForm(ViewTypeEnum type, Set<Map.Entry<String,List<String>>> formParams) throws BIConfigException;

}
