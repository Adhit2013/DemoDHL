package org.dhl.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {

    private static Logger Log;

    static{
        System.setProperty("log4j.configurationFile", "resources\\log4j2.xml");
        Log = LogManager.getLogger(Log.class.getName());
    }

    public static void startTestCase(String sTestCaseName){
        Log.info("Test case " + sTestCaseName + " Started");
    }


    public static void endTestCase(String sTestCaseName){
        Log.info("Test case " + sTestCaseName + " Ended");
    }


    public static void info(String message) {
        Log.info(message);
    }
    public static void warn(String message) { Log.warn(message); }
    public static void error(String message) {
        Log.error(message);
    }
    public static void fatal(String message) {
        Log.fatal(message);
    }
    public static void debug(String message) {
        Log.debug(message);
    }
}