package org.dhl.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserUtil {

    public static WebDriver driver = null;

    public BrowserUtil(WebDriver driver){
        BrowserUtil.driver = driver;
    }

    public static void openBrowser(){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", Constant.Driver_Path);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("chrome.switches", "--disable-extensions");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(Constant.URL);
            Log.info("[" + BrowserUtil.class.getSimpleName() + "] - " + "Driver initialized");
        }
    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

    public static String getURL(){
        return driver.getCurrentUrl();
    }

    public static void navigateTo(String url){
        driver.navigate().to(Constant.URL);
    }
}