package org.dhl.stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.dhl.pageObjects.Home_Page;
import org.dhl.utils.BrowserUtil;
import org.dhl.utils.Constant;
import org.dhl.utils.Log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

public class LocationSelection {
    @When("^User selects (.*) from dropdown$")
    public void user_selects_location_from_dropdown(String loc) throws Throwable {

        String testStep;

        try {
            testStep = LocationSelection.class.getDeclaredMethod("user_selects_location_from_dropdown", String.class).getDeclaredAnnotation(When.class).value();
        }
        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try {
            Home_Page.dropdown_Location().click();
            Home_Page.li_location(loc).click();
            Home_Page.btn_Location().click();

            (new WebDriverWait(BrowserUtil.driver, 10)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete");
                }
            });
        }

        catch(NoSuchElementException nsee){
            Log.error(testStep + " failed for " + nsee.getClass().getSimpleName());
            throw(nsee);
        }
    }

    @Then("^Home Page should be displayed in ([a-z]+) for (.*)$")
    public void home_page_should_be_displayed_in_language_for_location(String lang, String loc) throws Throwable {

        String testStep;
        Properties langProp;
        Set langSet;
        Iterator <String> langIterator;
        boolean matchFlag = true;

        try {
            testStep = LocationSelection.class.getDeclaredMethod("home_page_should_be_displayed_in_language_for_location", String.class, String.class).getDeclaredAnnotation(Then.class).value();
        }
        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try{
            langProp = new Properties();
            InputStream io = new FileInputStream(new File(Constant.Ascii_Path + "\\i18n_" + lang + ".properties"));
            langProp.load(io);
        }
        catch(IOException ioe){
            Log.error(testStep + " failed for " + ioe.getClass().getSimpleName());
            throw(ioe);
        }

        langSet = langProp.keySet();
        langIterator = langSet.iterator();

        while(langIterator.hasNext()){
              String menuKey = langIterator.next();
              try {
                  if (!((WebElement) Home_Page.class.getMethod(menuKey).invoke(Home_Page.class)).getText().equals(langProp.getProperty(menuKey))) {
                      Log.info(testStep + " failed for " + menuKey + "in " + lang + "for " + loc);
                      matchFlag = false;
                  }
              }
              catch(NoSuchMethodException nsme){
                  Log.error(testStep + " failed for " + nsme.getClass().getSimpleName());
                  throw(nsme);
              }
              catch(IllegalArgumentException  iae){
                  Log.error(testStep + " failed for " + iae.getClass().getSimpleName());
                  throw(iae);
              }
        }

        if(matchFlag == true){
           Log.info(testStep + " passed for " + lang + " for " + loc);
        }
        else{
            Log.error(testStep + " failed for " + lang + " for " + loc);
            throw(new Exception(testStep + " failed for " + lang + " for " + loc));
        }
    }
}
