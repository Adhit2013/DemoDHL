package org.dhl.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.dhl.pageObjects.DCT_Page;
import org.dhl.pageObjects.Home_Page;
import org.dhl.utils.BrowserUtil;
import org.dhl.utils.Log;

import java.util.NoSuchElementException;

import static junit.framework.Assert.assertEquals;

public class DCT {

    @And("^User clicks on DCT link$")
    public void user_clicks_on_dct_link() throws Throwable {
        String testStep;

        try {
            testStep = DCT.class.getDeclaredMethod("user_clicks_on_dct_link", null).getDeclaredAnnotation(And.class).value();
        }

        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try {
            Home_Page.lnk_DCT().click();
            Thread.sleep(5000);
            String mainWinHandle = BrowserUtil.driver.getWindowHandle();
            Log.info(mainWinHandle);
            for(String winHandle : BrowserUtil.driver.getWindowHandles()){
                Log.info(winHandle);
                if(!winHandle.equals(mainWinHandle)){
                    BrowserUtil.driver.switchTo().window(winHandle);
                    Log.info("Switched to DCT window");
                    break;
                }
            }
            Log.info(testStep + " passed");
        }
        catch(NoSuchElementException nsee){
            Log.error(testStep + " failed for " + nsee.getClass().getSimpleName());
            throw(nsee);
        }
    }

    @When("^User selects ([A-Z ]+\\([A-Z]+\\))$")
    public void user_selects_origin_country(String ctry) throws Throwable {
        String testStep;

        try {
            testStep = DCT.class.getDeclaredMethod("user_selects_origin_country", String.class).getDeclaredAnnotation(When.class).value();
        }
        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try {
            DCT_Page.dropdown_OrginCountry().click();
            DCT_Page.li_OrginCountry(ctry).click();
            Thread.sleep(5000);
            assertEquals(ctry, DCT_Page.input_OrginCountry().getAttribute("value"));
        }
        catch(NoSuchElementException nsee){
            Log.error(testStep + " failed for " + nsee.getClass().getSimpleName());
            throw(nsee);
        }

        catch(AssertionError ae){
            Log.error(testStep + " failed for " + ae.getClass().getSimpleName());
            throw(ae);
        }
    }

    @And("^User types the ([A-Z0-9]+) and selects ([A-Z0-9]+,[A-Z]+)$")
    public void user_types_the_origin_zip_and_selects_origin_zip_origin_city(String zip, String zipncity) throws Throwable {
        String testStep;

        try {
            testStep = DCT.class.getDeclaredMethod("user_types_the_origin_zip_and_selects_origin_zip_origin_city", String.class, String.class).getDeclaredAnnotation(And.class).value();
        }
        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try{
            DCT_Page.input_OriginZip().sendKeys(zip);
            DCT_Page.li_OriginZipCity(zip, zipncity.split(",")[1]).click();
            Thread.sleep(5000);
            assertEquals(zip, DCT_Page.input_OriginZip().getAttribute("value"));
        }
        catch(NoSuchElementException nsee){
            Log.error(testStep + " failed for " + nsee.getClass().getSimpleName());
            throw(nsee);
        }

        catch(AssertionError ae){
            Log.error(testStep + " failed for " + ae.getClass().getSimpleName());
            throw(ae);
        }
    }

    @Then("^([A-Z]+) and ([A-Z]*) should be populated$")
    public void origin_city_and_origin_suburb_should_be_populated(String city, String sub) throws Throwable {
        String testStep;

        try {
            testStep = DCT.class.getDeclaredMethod("origin_city_and_origin_suburb_should_be_populated", String.class, String.class).getDeclaredAnnotation(Then.class).value();
        }
        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try {
            Thread.sleep(5000);
            assertEquals(city, DCT_Page.input_OrginCity().getAttribute("value"));
            assertEquals(sub, DCT_Page.input_OrginSuburb().getAttribute("value"));
            String dctWinHandle = BrowserUtil.driver.getWindowHandle();
            String mainWinHandle = "";
            for(String winHandle : BrowserUtil.driver.getWindowHandles()){
                if(!winHandle.equals(dctWinHandle)){
                    mainWinHandle = winHandle;
                }else{
                    BrowserUtil.driver.close();
                    Log.info("DCT window closed");
                }
            }
            BrowserUtil.driver.switchTo().window(mainWinHandle);
            Log.info("Switched to Main window");

        }

        catch(NoSuchElementException nsee){
            Log.error(testStep + " failed for " + nsee.getClass().getSimpleName());
            throw(nsee);
        }

        catch(AssertionError ae){
            Log.error(testStep + " failed for " + ae.getClass().getSimpleName());
            throw(ae);
        }
    }
}
