package org.dhl.stepDefs;

import org.dhl.pageObjects.Home_Page;
import org.dhl.utils.BrowserUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.dhl.utils.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import static junit.framework.Assert.assertTrue;

public class TestHomeLoad{

    @Given("^DHL Home Page accessed in browser$")
    public void dhl_home_page_accessed_in_browser() {
        String testStep;

        try {
            assertTrue(BrowserUtil.driver.getCurrentUrl().equals("http://www.dhl.com/en.htm"));
        }
        catch(AssertionError ae){
            try {
                 testStep = TestHomeLoad.class.getDeclaredMethod("dhl_home_page_accessed_in_browser", null).getDeclaredAnnotation(Given.class).value();
                 Log.error(testStep + " failed for " + ae.getClass().getSimpleName());
            }
            catch(NoSuchMethodException nsm){
                Log.error(nsm.getMessage());
            }
            throw(ae);
        }
    }


    @Then("^DHL Home Page should be loaded in browser$")
    public void dhl_home_page_should_be_loaded_in_browser()
    {
        String testStep;

        (new WebDriverWait(BrowserUtil.driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().equals("DHL | Global | English");
            }
        });

        try {
            assertTrue(BrowserUtil.driver.getTitle().equals("DHL | Global | English"));

            assertTrue(Home_Page.menu_Express().getText().equals("Express"));
            assertTrue(Home_Page.menu_Express().isDisplayed());
            assertTrue(Home_Page.menu_Logistics().getText().equals("Logistics"));
            assertTrue(Home_Page.menu_Logistics().isDisplayed());
            assertTrue(Home_Page.menu_Mail().getText().equals("Mail"));
            assertTrue(Home_Page.menu_Mail().isDisplayed());
            assertTrue(Home_Page.menu_Press().getText().equals("Press"));
            assertTrue(Home_Page.menu_Press().isDisplayed());
            assertTrue(Home_Page.menu_Careers().getText().equals("Careers"));
            assertTrue(Home_Page.menu_Careers().isDisplayed());
            assertTrue(Home_Page.menu_AboutUs().getText().equals("About Us"));
            assertTrue(Home_Page.menu_AboutUs().isDisplayed());

            assertTrue(Home_Page.input_Search().isDisplayed());
            assertTrue(Home_Page.btn_Search().isDisplayed());

            assertTrue(Home_Page.dropdown_Location().isDisplayed());
            assertTrue(Home_Page.btn_Location().isDisplayed());

            assertTrue(Home_Page.input_Track().isDisplayed());
            assertTrue(Home_Page.but_Track().isDisplayed());

            assertTrue(Home_Page.tab_DHL_Services().isDisplayed());
            assertTrue(Home_Page.tab_Industry_Sector().isDisplayed());
            assertTrue(Home_Page.tab_AboutUs().isDisplayed());
        }

        catch(NoSuchElementException nse){
            try {
                testStep = TestHomeLoad.class.getDeclaredMethod("dhl_home_page_should_be_loaded_in_browser", null).getDeclaredAnnotation(Then.class).value();
                Log.error(testStep + " failed for " + nse.getClass().getSimpleName());
            }
            catch(NoSuchMethodException nsm){
                Log.error(nsm.getMessage());
            }

            throw(nse);
        }
        catch(AssertionError ae){
            try {
                testStep = TestHomeLoad.class.getDeclaredMethod("dhl_home_page_should_be_loaded_in_browser", null).getDeclaredAnnotation(Then.class).value();
                Log.error(testStep + " failed for " + ae.getClass().getSimpleName());
            }
            catch(NoSuchMethodException nsm){
                Log.error(nsm.getMessage());
            }

            throw(ae);
        }
    }

    @After
    public void captureFailure(Scenario scenario)
    {
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) BrowserUtil.driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

    }

}