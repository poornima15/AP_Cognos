package com.jda.ap.bi.cognos;

import com.jda.ap.bi.IBIModelServices;
import com.jda.ap.bi.enums.ModelCommandEnum;
import com.jda.ap.bi.enums.ScriptPlaceholderEnum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class APFrameworkManagerImplTest
{

        private IBIModelServices frameworkManager = null;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Setting up tests...");
        frameworkManager = new APFrameworkManagerImpl(new File("D:\\GitHub\\AP_Cognos\\config"));

    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testSubmitRequest() throws Exception
    {

    }

    @Test
    public void createNewPackage() throws Exception
    {
        Map<ScriptPlaceholderEnum, String> commandValues = new HashMap<>();
        commandValues.put(ScriptPlaceholderEnum.MODEL,"test");
        frameworkManager.submitRequest(ModelCommandEnum.CREATE_PACKAGE, commandValues);
    }

}