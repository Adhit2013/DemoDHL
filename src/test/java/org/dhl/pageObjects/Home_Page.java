package org.dhl.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.dhl.utils.Log;
import org.dhl.utils.BrowserUtil;

import java.util.NoSuchElementException;

public class Home_Page extends BrowserUtil{

        private static WebElement element = null;

        public Home_Page (WebDriver driver){
            super(driver);
        }

        public static WebElement menu_Express() throws NoSuchElementException{
            try{
	        	 element = driver.findElement(By.xpath("//*[@id='nav']/li[1]/a/span"));
	             Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Express menu found on the Home Page");
            }catch (NoSuchElementException e){
           		Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Express menu not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }

        public static WebElement menu_Logistics() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Logistics menu found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Logistics menu not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement menu_Mail() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='nav']/li[3]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Mail menu found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Mail menu not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement menu_Press() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='nav']/li[4]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Press menu found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Press menu not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement menu_Careers() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='nav']/li[5]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Careers menu found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Careers menu not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement menu_AboutUs() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='nav']/li[6]/a/span"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "About Us menu found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "About Us menu not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement input_Search() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='q']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search input box found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search input box not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement btn_Search() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='search']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search button found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Content Search button not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement dropdown_Location() throws NoSuchElementException{
            try{
                element = driver.findElement(By.cssSelector("input.dropdownButton"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector dropdown found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector dropdown not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement btn_Location() throws NoSuchElementException{
            try{
                element = driver.findElement(By.cssSelector("a.goButton"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector button found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Location selector button not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement tab_DHL_Services() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='#dhl_services']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "DHL Services tab found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "DHL Services tab not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement tab_Industry_Sector() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='#industry_sector']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Industry Sector tab found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Industry Sector tab not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement tab_AboutUs() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='#about_us']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "About Us tab found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "About Us tab not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement input_Track() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='AWB_crossrefpar1_taskcenter_taskcentertabs_item1229046233349_par_expandablelink_insideparsys_fasttrack']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Track input box found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Track input box not found on the Home Page");
                throw(e);
            }
            return element;
        }

        public static WebElement but_Track() throws NoSuchElementException{
            try{
                element = driver.findElement(By.xpath("//*[@id='trackbut_crossrefpar1_taskcenter_taskcentertabs_item1229046233349_par_expandablelink_insideparsys_fasttrack']"));
                Log.info("[" + Home_Page.class.getSimpleName() + "] - " + "Track button found on the Home Page");
            }catch (NoSuchElementException e){
                Log.error("[" + Home_Page.class.getSimpleName() + "] - " + "Track button not found on the Home Page");
                throw(e);
            }
            return element;
        }
    }
