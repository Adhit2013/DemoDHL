package org.dhl.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ObjectUtil {

    public static void mouseHoverAction(WebDriver driver, WebElement element){

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Log.info("[" + ObjectUtil.class.getSimpleName() + "] - " + "Mouse over " + element.getText() + " menu");
    }

    public static void saveScreenshot(WebElement element, File elementScreenshotFile) throws IOException{
        try {
            File pageScreenshotFile = ((TakesScreenshot) BrowserUtil.driver).getScreenshotAs(OutputType.FILE);
            BufferedImage pageImage = ImageIO.read(pageScreenshotFile);
            Point point = element.getLocation();
            int elementWidth = element.getSize().getWidth();
            int elementHeight = element.getSize().getHeight();
            BufferedImage elementScreenshot = pageImage.getSubimage(point.getX(), point.getY(), elementWidth, elementHeight);
            ImageIO.write(elementScreenshot, "png", elementScreenshotFile);
            Log.info("[" + ObjectUtil.class.getSimpleName() + "] - " + "Screenshot saved");
        }
        catch(IOException ioe){
            Log.info("[" + ObjectUtil.class.getSimpleName() + "] - " + "Screenshot not saved");
            throw(ioe);
        }
    }
}
