package org.dhl.utils;

import org.dhl.pageObjects.Home_Page;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class CaptureScreenshot{
    public static void main(String [] str) throws IOException, InterruptedException{
        BrowserUtil.openBrowser();
        Iterator<WebElement> tabNums = Home_Page.tab_numbers().iterator();
        Iterator<WebElement> tabImages = Home_Page.tab_images().iterator();

        WebElement tabImage = tabImages.next();

        while(tabNums.hasNext()) {
            WebElement tabNum = tabNums.next();
            tabNum.click();
            Thread.sleep(2000);
            ObjectUtil.saveScreenshot(tabImage, new File(Constant.ScreenShot_Path + "\\Home\\Home_" + tabNum.getText() + ".png"));
        }
        BrowserUtil.closeBrowser();
    }
}
