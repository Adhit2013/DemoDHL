package org.dhl.pageObjects;

import org.dhl.utils.BrowserUtil;
import org.dhl.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class DutyAtDest_Page extends BrowserUtil {

    private static WebElement element = null;
    private static List<WebElement> elements = null;

    public DutyAtDest_Page(WebDriver driver) {
        super(driver);
    }

    public static WebElement tab_Declarable() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='li_declarableDiv']"));
            Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Declarable tab found on About Duty At Destination Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Declarable tab not found on About Duty At Destination Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement tab_NonDeclarable() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='li_nonDeclarableDiv']"));
            Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Non Declarable tab found on About Duty At Destination Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Non Declarable tab not found on About Duty At Destination Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement tab_Prohibited() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='li_prohibitedDiv']"));
            Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Prohibited tab found on About Duty At Destination Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Prohibited tab not found on About Duty At Destination Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement tab_Restricted() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='li_restrictedDiv']"));
            Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Restricted tab found on About Duty At Destination Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + "Restricted tab not found on About Duty At Destination Page");
            throw(nsee);
        }
        return element;
    }

    public static List<WebElement> items_Declarable() throws NoSuchElementException {
        elements = driver.findElements(By.xpath(".//*[@id='declarableDiv']//td"));
        Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + elements.size() + "Declarable items found on About Duty At Destination Page");

        return elements;
    }


    public static List<WebElement> items_NonDeclarable() throws NoSuchElementException {
        elements = driver.findElements(By.xpath(".//*[@id='nonDeclarableDiv']//td"));
        Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + elements.size() + "Non Declarable items found on About Duty At Destination Page");

        return elements;
    }

    public static List<WebElement> items_Prohibited() throws NoSuchElementException {
        elements = driver.findElements(By.xpath(".//*[@id='prohibitedDiv']//td"));
        Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + elements.size() + "Prohibited items found on About Duty At Destination Page");

        return elements;
    }

    public static List<WebElement> items_Restricted() throws NoSuchElementException {
        elements = driver.findElements(By.xpath(".//*[@id='restrictedDiv']//td"));
        Log.info("[" + DutyAtDest_Page.class.getSimpleName() + "] - " + elements.size() + "Restricted items found on About Duty At Destination Page");

        return elements;
    }
}
