package org.dhl.runner;

import org.dhl.utils.BrowserUtil;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

import org.dhl.utils.Log;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:report/cucumber-html-report", "json:report/cucumber-report.json"},
        features = {"features"},
        glue = "org.dhl.stepDefs"
)

public class CucumberTest {

    @BeforeClass
    public static void setUp(){
        Log.info("[" + CucumberTest.class.getSimpleName() + "] - " + "Setting up test environment");
        BrowserUtil.openBrowser();
    }

    @AfterClass
    public static void tearDown() {
        Log.info("[" + CucumberTest.class.getSimpleName() + "] - " + "Resetting test environment");
        BrowserUtil.closeBrowser();
    }

}