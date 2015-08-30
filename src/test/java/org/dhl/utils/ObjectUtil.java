package org.dhl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ObjectUtil {

    public static void mouseHoverAction(WebDriver driver, WebElement element){

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Log.info("Mouse over " + element.getText() + " menu");
    }
}
