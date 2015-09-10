package org.dhl.stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.dhl.pageObjects.Home_Page;
import org.dhl.utils.Constant;
import org.dhl.utils.Log;
import org.dhl.utils.ObjectUtil;
import org.openqa.selenium.WebElement;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import static junit.framework.Assert.assertTrue;

public class HomeTabNums {
    @When("^User navigate (\\d+) tab$")
    public void user_navigate_number_tab(int num) throws Throwable {
        String testStep;

        try {
            testStep = HomeTabNums.class.getDeclaredMethod("user_navigate_number_tab", int.class).getDeclaredAnnotation(When.class).value();
        }
        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try {
            Home_Page.tab_numbers().get(num - 1).click();
            Thread.sleep(2000);
            Log.info(testStep + " passed");
        }
        catch(InterruptedException ie){
            Log.error(testStep + " failed for " + ie.getClass().getSimpleName());
            throw(ie);
        }

    }

    @Then("^Home_(\\d+)\\.png should be displayed$")
    public void home_number_png_should_be_displayed(int num) throws Throwable {
        String testStep;

        try {
            testStep = HomeTabNums.class.getDeclaredMethod("home_number_png_should_be_displayed", int.class).getDeclaredAnnotation(Then.class).value();
        }
        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try {
            Iterator<WebElement> tabImages = Home_Page.tab_images().iterator();
            WebElement tabImage = tabImages.next();
            String numText = Home_Page.tab_numbers().get(num - 1).getText();
            File actualImage = new File(Constant.ScreenShot_Path + "\\Home\\Home_" + numText + ".png");
            File expectedImage = new File(Constant.ScreenShot_Path + "\\Home\\Test_Home_" + numText + ".png");
            ObjectUtil.saveScreenshot(tabImage, expectedImage);

            BufferedImage expectedBufferImage = ImageIO.read(expectedImage);
            DataBuffer expectedDataBuffer = expectedBufferImage.getData().getDataBuffer();
            int expectedDateBufferSize = expectedDataBuffer.getSize();

            BufferedImage actualBufferImage = ImageIO.read(actualImage);
            DataBuffer actualDataBuffer = actualBufferImage.getData().getDataBuffer();
            int actualDateBufferSize = actualDataBuffer.getSize();

            boolean matchFlag = true;

            if(expectedDateBufferSize == actualDateBufferSize) {
                for(int n=0; n<expectedDateBufferSize; n++) {
                    if(expectedDataBuffer.getElem(n) != actualDataBuffer.getElem(n)) {
                        matchFlag = false;
                        break;
                    }
                }
            }
            else {
                matchFlag = false;
            }

            if(matchFlag == true) {
                Log.info(testStep + " passed for image number " + num);
            }
            else{
                Log.error(testStep + " failed for image number " + num);
                throw(new Exception(testStep + " failed for image number " + num));
            }
        }
        catch(IOException ioe){
            Log.error(testStep + " failed for " + ioe.getClass().getSimpleName());
            throw(ioe);
        }
    }
}
