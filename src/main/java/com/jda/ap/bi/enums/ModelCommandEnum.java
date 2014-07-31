package com.jda.ap.bi.enums;

import com.jda.ap.bi.cognos.exception.FrameworkManagerException;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * User: Lee
 * Date: 7/29/2014
 * Time: 1:24 PM
 */
public enum ModelCommandEnum
{
    CREATE_PACKAGE("login-create-package-test.xml"), CREATE_DATA_SOURCE("create-data-source.xml");

    private String scriptName;

    ModelCommandEnum(String scriptName)
    {
        this.scriptName = scriptName;
    }

    public String getScriptName()
    {
        return scriptName;
    }

    /**
     * Get the co-responding script file for the command
     * @return
     * @throws FrameworkManagerException
     */
    public File getScriptFile() throws FrameworkManagerException {
        String name = this.getScriptName();

        try
        {

            URI scriptFileURI = this.getClass().getResource("/" + name).toURI() ;

            File returnFile = new File(scriptFileURI.getPath());

            if ( returnFile == null || !returnFile.exists()) {
                throw new FrameworkManagerException("Failed to locate file: " + scriptFileURI.getPath());
            }

            return returnFile;
        }
        catch (URISyntaxException e)
        {
            throw new FrameworkManagerException("URI Error: : " + e.getMessage());
        }

    }
}
