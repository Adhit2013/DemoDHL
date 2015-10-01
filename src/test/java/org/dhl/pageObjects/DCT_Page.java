package org.dhl.pageObjects;

import org.dhl.utils.BrowserUtil;
import org.dhl.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class DCT_Page extends BrowserUtil{

    private static WebElement element = null;
    private static List<WebElement> elements = null;

    public DCT_Page (WebDriver driver){
        super(driver);
    }

    public static WebElement input_Language() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='locale_id']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Language dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Language dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_OrginCountry() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgCtry']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country textfield found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country textfield found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_OrginCountry() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgCtry']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_OrginCountry(String ctry) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-4']/li/a[text()='" + ctry + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_DestinationCountry() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dstCtry']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country textfield found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country textfield found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_DestinationCountry() throws NoSuchElementException {
        try {
            element = driver.findElement(By.xpath(".//*[@name='dstCtry']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country dropdown found on the DCT Page");
        } catch (NoSuchElementException nsee) {
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country dropdown not found on the DCT Page");
            throw (nsee);
        }
        return element;
    }

    public static WebElement li_DestinationCountry(String ctry) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-8']/li/a[text()='" + ctry + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_OriginZip() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgZip']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Zip input found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Zip input not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_OriginZipCity(String zip, String city) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-5']/li/a[text()='" + zip + "," + city + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Zip,City found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Zip,City not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_DestinationZip() throws NoSuchElementException {
        try {
            element = driver.findElement(By.xpath(".//*[@name='dstZip']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Zip input found on the DCT Page");
        } catch (NoSuchElementException nsee) {
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Zip input not found on the DCT Page");
            throw (nsee);
        }
        return element;
    }

    public static WebElement li_DestinationZipCity(String zip, String city) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-9']/li/a[text()='" + zip + "," + city + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Zip,City found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Zip,City not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_OrginCity() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgCity']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City textfield found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City textfield found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_OriginCity() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgCity']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_OriginCityZip(String city, String zip) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-6']/li/a[text()='" + city + "," + zip + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City,Zip found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City,Zip not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_DestinationCity() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dstCity']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City textfield found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City textfield found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_DestinationCity() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dstCity']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_DestinationCityZip(String city, String zip) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-10']/li/a[text()='" + city + "," + zip + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City,Zip found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City,Zip not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_OrginSuburb() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgSub']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb textfield found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb textfield found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_OriginSuburb() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgSub']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_OriginSuburb(String sub) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-7']/li/a[text()='" + sub + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_DestinationSuburb() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dstSub']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb textfield found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb textfield found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_DestinationSuburb() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dstSub']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_DestinationSuburb(String sub) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-11']/li/a[text()='" + sub + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement button_Clear() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[text()='Clear']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Clear button found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Clear button not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement button_SaveFromAddress() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[text()='Save From Address']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Save From Address button found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Save From Address button not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement button_AboutDutyatDestination() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='customs_info']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "About Duty at Destination button found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "About Duty at Destination button not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement button_AboutWeight() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='shipment_info']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "About Weight button found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "About Weight button not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_ShippingDate() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='shpDate']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Shipping date input found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Shipping date input not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement checkbox_DutiableMaterial() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dtbl']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Dutiable Material checkbox found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Dutiable Material checkbox not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_Declaredvalue() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='declVal']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value input found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value input not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_Declaredvaluecurrency() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='declValCur']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value currency input found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value currency input not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_Declaredvaluecurrency() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='declValCur']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value currency dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value currency dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_Declaredvaluecurrency(String curr) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-13']/li/a[text()='" + curr + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Currency found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Currency not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_Numberofpieces() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='number_of_pieces']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces input found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces input not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_Numberofpieces() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='number_of_pieces']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_Numberofpieces(String num) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-1']/li/a[text()='" + num + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_UnitsWeight() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='w_unit_master']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Weight Unit input found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Weight Unit input not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_UnitsWeight() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='w_unit_master']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Units weight dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Units weight dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_UnitsWeight(String wgt) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-2']/li/a[text()='" + wgt + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Weight Unit found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Weight Unit not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement input_UnitsDimension() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='d_unit_master']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Dimension Unit input found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Dimension Unit input not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_UnitsDimension() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='d_unit_master']/following-sibling::div[1]/span[@class='ui-icon ui-icon-carat-1-s"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Units dimension dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Units dimension dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement li_UnitsDimension(String dim) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='ui-id-3']/li/a[text()='" + dim + "']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Dimension Unit found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Dimension Unit not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement button_ToImperial() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='toImperial']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "To Imperial button found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "To Imperial button not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement tablerow_Pieces(int row) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='piece_details']/table/tbody/tr[" + row + "]"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Table row for piece " + row + " found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Table row for piece " + row + " not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static List<WebElement> tablecol_Pieces(int col) throws NoSuchElementException {
        elements = driver.findElements(By.xpath(".//*[@id='piece_details']/table/tbody/tr/td[" + col + "]"));
        if(elements.size()>0) {
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Table column " + col + " for pieces found on the DCT Page");
        }
        else{
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Table column " + col + " for pieces not found on the DCT Page");
        }
        return elements;
    }

    public static WebElement tablerowcol_Pieces(int row, int col) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='piece_details']/table/tbody/tr[" + row + "]" + "/td[" + col + "]"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Table row column " + row + col + " for piece found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Table row column " + row + col + " for piece not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement tableheadcol_Pieces(int col) throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='piece_details']/table/thead/tr/th[" + col + "]"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Pieces table header " + col + " found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Pieces table header" + col + " not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement button_Search() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='calculate']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Search button found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Search button not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

}
