package com.jda.ap.bi.test;


import com.jda.ap.bi.IBIModelServices;
import com.jda.ap.bi.cognos.APFrameworkManagerImpl;
import com.jda.ap.bi.cognos.config.CognosServiceConfig;
import com.jda.ap.bi.enums.ModelCommandEnum;
import com.jda.ap.bi.enums.ScriptPlaceholderEnum;
import com.jda.ap.bi.modeller.Modeller;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class APFrameworkManagerImplTest
{

    private static CognosServiceConfig config = CognosServiceConfig.getInstance();
    private static IBIModelServices frameworkManager = null;

    @BeforeClass
    public static void setup()
    {
        System.out.println("Setting up tests...");
        frameworkManager = new APFrameworkManagerImpl(new File("D:\\GitHub\\AP_Cognos\\config"));

    }

    @AfterClass
    public static void done()
    {
        System.out.println("Completed");
    }


    @Test
    public void changeAndSaveConfig() throws Exception
    {
        frameworkManager.getConfig().getServiceConfig().getBI().getCognos().setUsername("someInvalidUser");
        frameworkManager.saveConfig();
        frameworkManager.getConfig().getServiceConfig().getBI().getCognos().setUsername("administrator");
        frameworkManager.saveConfig();

    }

    @Test
    public void createNewPackage() throws Exception
    {
        Map<ScriptPlaceholderEnum, String> commandValues = new HashMap<>();
        commandValues.put(ScriptPlaceholderEnum.MODEL, "test");
        frameworkManager.submitRequest(ModelCommandEnum.CREATE_PACKAGE, commandValues);
    }

    @Test
    public void createDatasource()
    {
        try
        {
            frameworkManager.createDataSource("Assortment planning", "^User ID:^?Password:;LOCAL;OR;ORACLE@%s@jdbc:oracle:thin:@localhost:1521:xe/%s@COLSEQ=IBM_JD_CNX_STR:^User ID:^?Password:;LOCAL;JD-OR;URL=jdbc:oracle:thin:@//localhost:1521/xe;DRIVER_NAME=oracle.jdbc.driver.OracleDriver");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Test
    public void getDatasources()
    {
        try
        {
            Map<String, String> sources = frameworkManager.listDataSourcesAndConnections();
            for (String source : sources.keySet())
            {
                System.out.println("Source: " + source);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void getModeller() throws Exception {
        Modeller modeller = frameworkManager.getModeller();
       String alias = modeller.getAttributeAlias("A_SC_CP");
        assertEquals("Checking alias", "STYLECOLOR_CHANNEL_PHASE", alias);
        System.out.println("Got alias: " + alias);
    }


    @Test
    public void testQuickLogon() throws Exception
    {

        String quickLogon = frameworkManager.connectToService();
        //Check that two objects are equal
        assertEquals(quickLogon, "Logon successful as administrator");
    }
}