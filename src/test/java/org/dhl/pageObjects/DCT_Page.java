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

    public static WebElement dropdown_Language() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='locale_id']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Language dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Language dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_OrginCountry() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgCtry']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Country dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_DestinationCountry() throws NoSuchElementException {
        try {
            element = driver.findElement(By.xpath(".//*[@name='dstCtry']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country dropdown found on the DCT Page");
        } catch (NoSuchElementException nsee) {
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Country dropdown not found on the DCT Page");
            throw (nsee);
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

    public static WebElement dropdown_OriginCity() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgCity']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin City dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_DestinationCity() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dstCity']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination City dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_OriginSuburb() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='orgSub']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Origin Suburb dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_DestinationSuburb() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='dstSub']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Destination Suburb dropdown not found on the DCT Page");
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
            element = driver.findElement(By.xpath(".//*[text()='About Duty at Destination']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "About Duty at Destination button found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "About Duty at Destination button not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement button_AboutWeight() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[text()='About Weight']"));
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

    public static WebElement dropdown_Declaredvaluecurrency() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='declValCur']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value currency dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Declared value currency dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_Numberofpieces() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@name='number_of_pieces']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Number of pieces dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_UnitsWeight() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='w_unit_master']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Units weight dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Units weight dropdown not found on the DCT Page");
            throw(nsee);
        }
        return element;
    }

    public static WebElement dropdown_UnitsDimension() throws NoSuchElementException {
        try{
            element = driver.findElement(By.xpath(".//*[@id='d_unit_master']"));
            Log.info("[" + DCT_Page.class.getSimpleName() + "] - " + "Units dimension dropdown found on the DCT Page");
        }catch (NoSuchElementException nsee){
            Log.error("[" + DCT_Page.class.getSimpleName() + "] - " + "Units dimension dropdown not found on the DCT Page");
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
