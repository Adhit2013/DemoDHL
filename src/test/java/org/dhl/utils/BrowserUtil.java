package org.dhl.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {

    public static WebDriver driver = null;

    public BrowserUtil(WebDriver driver){
        BrowserUtil.driver = driver;
    }

    public static void openBrowser(){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", Constant.Driver_Path);
            driver = new ChromeDriver();
            driver.get(Constant.URL);
            Log.info("[" + BrowserUtil.class.getSimpleName() + "] - " + "Driver initialized");
        }
    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
}