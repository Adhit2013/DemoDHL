package org.dhl.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Constant {

    public static Properties props;

    public static final String Driver_Path;
    public static final String URL;
    public static final String ScreenShot_Path;
    public static final String Resource_Path;

    static {
        try {
            InputStream io = new FileInputStream(new File("resources\\project.properties"));
            props = new Properties();
            props.load(io);

        } catch (IOException ioe) {
            System.out.println("Project properties file not found");
        }

        URL = "http://www.dhl.com";
        Driver_Path = props.getProperty("project.directory") + "\\resources\\chromedriver.exe";
        Resource_Path = props.getProperty("project.directory") + "\\resources";
        ScreenShot_Path = Resource_Path + "\\screenshots";
    }
}
