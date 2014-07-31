package com.jda.ap.bi.test;

import com.jda.ap.bi.IBIModelServices;
import com.jda.ap.bi.cognos.APFrameworkManagerImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

/**
 * User: Lee
 * Date: 7/28/2014
 * Time: 2:20 PM
 */
public class APFrameWorkManagerImplTestDirectConfig
{
    private static IBIModelServices frameworkManager = null;

    @BeforeClass
    public static void setup() {
        System.out.println("Setting up tests...");
        frameworkManager = new APFrameworkManagerImpl(new File("D:\\GitHub\\AP_Cognos\\config"));

    }

    @AfterClass
    public static void done() {
        System.out.println("Completed");
    }

    @Test
    public void doNothing() {
        // empty test
    }
}
