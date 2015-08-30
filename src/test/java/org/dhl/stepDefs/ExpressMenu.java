package org.dhl.stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.dhl.pageObjects.Home_Page;
import org.dhl.utils.Log;
import org.openqa.selenium.WebElement;

import java.util.*;

import static junit.framework.Assert.assertTrue;


public class ExpressMenu {

    private LinkedHashMap<WebElement, LinkedHashSet<WebElement>> expressMap;

    @When("^User access Express menu$")
    public void user_access_express_menu() throws Throwable{

        String testStep;

        try{
            testStep = ExpressMenu.class.getDeclaredMethod("user_access_express_menu", null).getDeclaredAnnotation(When.class).value();
        }

        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        try {
            expressMap = Home_Page.TopNavigation.express();
            Log.info(testStep + " passed");
        }
        catch (NoSuchElementException nsee) {
                Log.error(testStep + " failed for " + nsee.getClass().getSimpleName());
                throw(nsee);
            }
    }


    @Then("^Express menu contents should be displayed$")
    public void express_menu_contents_should_be_displayed() throws Throwable{

        String testStep;

        try{
            testStep = ExpressMenu.class.getDeclaredMethod("express_menu_contents_should_be_displayed", null).getDeclaredAnnotation(Then.class).value();
        }

        catch(NoSuchMethodException nsme){
            Log.error(nsme.getMessage());
            throw(nsme);
        }

        LinkedHashMap<String, String[]> expressMenuTestMap = new LinkedHashMap<String, String[]>();
        Iterator<Map.Entry<String, String []>> expressMenuTestIterator;

        expressMenuTestMap.put("DHL Express", null);
        expressMenuTestMap.put("MyDHL", new String[]{"Login", "Register", "Login and Register - US Customers"});
        expressMenuTestMap.put("Tracking", new String[]{"Monitor Shipments", "Tracking FAQs", "Track by Shipper's Reference", "Tracking Tools", "Electronic Proof of Delivery"});
        expressMenuTestMap.put("Shipping", new String[]{"Ship Online", "Get Rate and Time Quote", "Find DHL Locations", "Open an Account", "Order Supplies", "Shipping Advice", "Online Importing"});
        expressMenuTestMap.put("Customs Services and Support", null);
        expressMenuTestMap.put("Export Services", new String[]{"Same Day", "Time Definite", "Day Definite"});
        expressMenuTestMap.put("Import Services", new String[]{"Same Day", "Time Definite"});
        expressMenuTestMap.put("Domestic Services", new String[]{"Same Day", "Time Definite"});
        expressMenuTestMap.put("Small Business Solutions", null);
        expressMenuTestMap.put("Optional Services", null);
        expressMenuTestMap.put("Industry Solutions", null);
        expressMenuTestMap.put("Resource Center", new String[]{"Advanced Shipping Solutions", "Integrated Shipping Solutions", "Customer Service FAQs", "Downloads"});

        expressMenuTestIterator = expressMenuTestMap.entrySet().iterator();

        try {
            for (Map.Entry<WebElement, LinkedHashSet<WebElement>> expressMenuItem : expressMap.entrySet()) {
                Map.Entry<String, String []> expressSubmenuTestEntry = expressMenuTestIterator.next();
                assertTrue(expressSubmenuTestEntry.getKey().equals(expressMenuItem.getKey().getText()));
                assertTrue(expressMenuItem.getKey().isDisplayed());
                int submenuLen = 0;

                for (WebElement expressSubmenuItem : expressMenuItem.getValue()) {
                    if(expressSubmenuItem != null) {
                        assertTrue(expressSubmenuTestEntry.getValue()[submenuLen++].equals(expressSubmenuItem.getText()));
                        assertTrue(expressSubmenuItem.isDisplayed());
                    }
                }
            }

            Log.info(testStep + " passed");
        }
        catch(AssertionError ae){
                Log.error(testStep + " failed for " + ae.getClass().getSimpleName());
                throw(ae);
        }
    }
}
