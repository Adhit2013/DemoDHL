package org.dhl.pageObjects;

import org.dhl.utils.ObjectUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.dhl.utils.Log;
import org.dhl.utils.BrowserUtil;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

public class Home_Page extends BrowserUtil{

        private static WebElement element = null;
        private static List<WebElement> elements = null;

        public Home_Page (WebDriver driver){
            super(driver);
        }

        public static WebElement Logo() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='logo']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "DHL logo found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "DHL logo not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement menu_Express() throws NoSuchElementException{
            try{
	        	 element = driver.findElement(By.xpath(".//*[@id='nav']/li[1]/a/span"));
	             Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Express menu found on the Home Page");
            }catch (NoSuchElementException nsee){
           		Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Express menu not found on the Home Page");
           		throw(nsee);
           		}
           	return element;
        }

        public static WebElement menu_Logistics() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='nav']/li[2]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Logistics menu found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Logistics menu not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement menu_Mail() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Mail menu found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Mail menu not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement menu_Press() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='nav']/li[4]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Press menu found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Press menu not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement menu_Careers() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='nav']/li[5]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Careers menu found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Careers menu not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement menu_AboutUs() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='nav']/li[6]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "About Us menu found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "About Us menu not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement input_Search() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='q']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search input box found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search input box not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement btn_Search() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='search']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search button found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search button not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement dropdown_Location() throws NoSuchElementException{
            try{
                element = driver.findElement(By.cssSelector("input.dropdownButton"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector dropdown found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector dropdown not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement btn_Location() throws NoSuchElementException{
            try{
                element = driver.findElement(By.cssSelector("a.goButton"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector button found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector button not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement tab_DHL_Services() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='#dhl_services']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "DHL Services tab found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "DHL Services tab not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement tab_Industry_Sector() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='#industry_sector']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Industry Sector tab found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Industry Sector tab not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement tab_AboutUs() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='#about_us']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "About Us tab found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "About Us tab not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement input_Track() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='AWB_crossrefpar1_taskcenter_taskcentertabs_item1229046233349_par_expandablelink_insideparsys_fasttrack']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Track input box found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Track input box not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static WebElement li_location(String loc) throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@class='countryList styledDropdown']/li[text()=\"" + loc + "\"]"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + loc + " found in the location drop down on the Home Page");
            }
            catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + loc + " not found in the location drop down on Home Page");
                throw(nsee);
            }
            return element;

        }
        public static WebElement but_Track() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[@id='trackbut_crossrefpar1_taskcenter_taskcentertabs_item1229046233349_par_expandablelink_insideparsys_fasttrack']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Track button found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Track button not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static List<WebElement> tab_numbers(){
                elements = driver.findElements(By.xpath(".//a[(substring(\"**********\",1,string-length(text())) = translate(text(), \"0123456789\", \"**********\")) and (number(text()) = text())]"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Tab numbers found on the Home Page");
            return elements;
        }

        public static List<WebElement> tab_images(){
                elements = driver.findElements(By.xpath(".//img[@class = \"marketingStageContentImage\"]"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Tab images found on the Home Page");
            return elements;
        }

        public static WebElement lnk_DCT() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath(".//*[text()='Get Rate and Time Quote']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "DHL Capability Tool found on the Home Page");
            }catch (NoSuchElementException nsee){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "DHL Capability Tool not found on the Home Page");
                throw(nsee);
            }
            return element;
        }

        public static class TopNavigation {

               public static LinkedHashMap express() throws NoSuchElementException{
                       LinkedHashSet<WebElement> dhlExpressSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> myDHLSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> trackingSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> shippingSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> customerSASSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> exportServicesSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> importServicesSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> domesticServicesSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> smallBusinessSolsSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> optionalServicesSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> industrySolutionsSet = new LinkedHashSet<WebElement>();
                       LinkedHashSet<WebElement> resourceCenterSet = new LinkedHashSet<WebElement>();
                       LinkedHashMap<WebElement, LinkedHashSet<WebElement>> expressMap = new LinkedHashMap<WebElement, LinkedHashSet<WebElement>>();

                       ObjectUtil.mouseHoverAction(driver, menu_Express());

                       try {
                           dhlExpressSet.add(null);
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[1]/li/a")), dhlExpressSet);

                           myDHLSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[2]/ul/li[1]/a")));
                           myDHLSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[2]/ul/li[2]/a")));
                           myDHLSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[2]/ul/li[3]/a")));
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[2]/li/a")), myDHLSet);

                           trackingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[3]/ul/li[1]/a")));
                           trackingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[3]/ul/li[2]/a")));
                           trackingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[3]/ul/li[3]/a")));
                           trackingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[3]/ul/li[4]/a")));
                           trackingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[3]/ul/li[5]/a")));
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-1']/ul[3]/li/a")), trackingSet);

                           shippingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/ul/li[1]/a")));
                           shippingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/ul/li[2]/a")));
                           shippingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/ul/li[3]/a")));
                           shippingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/ul/li[4]/a")));
                           shippingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/ul/li[5]/a")));
                           shippingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/ul/li[6]/a")));
                           shippingSet.add(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/ul/li[7]/a")));
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[1]/li/a")), shippingSet);

                           customerSASSet.add(null);
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-2']/ul[2]/li/a")), dhlExpressSet);

                           exportServicesSet.add(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[1]/ul/li[1]/a")));
                           exportServicesSet.add(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[1]/ul/li[2]/a")));
                           exportServicesSet.add(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[1]/ul/li[3]/a")));
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[1]/li/a")), exportServicesSet);

                           importServicesSet.add(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[2]/ul/li[1]/a")));
                           importServicesSet.add(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[2]/ul/li[2]/a")));
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[2]/li/a")), importServicesSet);

                           domesticServicesSet.add(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[3]/ul/li[1]/a")));
                           domesticServicesSet.add(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[3]/ul/li[2]/a")));
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-3']/ul[3]/li/a")), domesticServicesSet);

                           smallBusinessSolsSet.add(null);
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-4']/ul[1]/li/a")), smallBusinessSolsSet);

                           optionalServicesSet.add(null);
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-4']/ul[2]/li/a")), optionalServicesSet);

                           industrySolutionsSet.add(null);
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-4']/ul[3]/li/a")), industrySolutionsSet);

                           resourceCenterSet.add(driver.findElement(By.xpath(".//*[@id='col-0-4']/ul[4]/ul/li[1]/a")));
                           resourceCenterSet.add(driver.findElement(By.xpath(".//*[@id='col-0-4']/ul[4]/ul/li[2]/a")));
                           resourceCenterSet.add(driver.findElement(By.xpath(".//*[@id='col-0-4']/ul[4]/ul/li[3]/a")));
                           expressMap.put(driver.findElement(By.xpath(".//*[@id='col-0-4']/ul[4]/li/a")), resourceCenterSet);

                           Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Express menu content found on the Home Page");
                       }
                       catch (NoSuchElementException nsee){
                           Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Express menu content not found on the Home Page");
                           throw(nsee);
                       }
                       return expressMap;

               }

            public static void logistics(){
                ObjectUtil.mouseHoverAction(driver, menu_Logistics());
            }

            public static void mail(){
                ObjectUtil.mouseHoverAction(driver, menu_Mail());
            }

            public static void press(){
                ObjectUtil.mouseHoverAction(driver, menu_Press());
            }

            public static void careers(){
                ObjectUtil.mouseHoverAction(driver, menu_Careers());
            }

            public static void aboutus(){
                ObjectUtil.mouseHoverAction(driver, menu_AboutUs());
            }
        }
    }

