package org.dhl.utils;


import org.dhl.pageObjects.DCT_Page;
import org.dhl.pageObjects.DutyAtDest_Page;
import org.dhl.pageObjects.Home_Page;

import java.io.File;
import java.io.IOException;

public class CaptureValue {
    public static void main(String [] str) throws IOException{
        if(str.length == 0 || str.length > 1)
        {
            Log.info("Wrong number of arguments");
            System.exit(1);
        }

        String ctry = str[0];
        String ctryCode = ctry.substring(ctry.indexOf('(') + 1,ctry.indexOf(')'));

        BrowserUtil.openBrowser();
        Home_Page.lnk_DCT().click();

        String mainWinHandle = BrowserUtil.driver.getWindowHandle();
        for(String winHandle : BrowserUtil.driver.getWindowHandles()){
            if(!winHandle.equals(mainWinHandle)){
                BrowserUtil.driver.switchTo().window(winHandle);
                Log.info("Switched to DCT window");
                break;
            }
        }
        DCT_Page.dropdown_DestinationCountry().click();
        DCT_Page.li_DestinationCountry(ctry).click();
        DCT_Page.button_AboutDutyatDestination().click();

        String dctWinHandle = BrowserUtil.driver.getWindowHandle();
        for(String winHandle : BrowserUtil.driver.getWindowHandles()){
            if(!(winHandle.equals(mainWinHandle) || winHandle.equals(dctWinHandle))){
                BrowserUtil.driver.switchTo().window(winHandle);
                Log.info("Switched to About Duty At Destination window");
                break;
            }
        }

        ObjectUtil.saveElementValue(DutyAtDest_Page.items_Declarable(), new File(Constant.TestData_Path + "\\" + ctryCode + "_declarable.txt"));
        DutyAtDest_Page.tab_NonDeclarable().click();
        ObjectUtil.saveElementValue(DutyAtDest_Page.items_NonDeclarable(), new File(Constant.TestData_Path + "\\" + ctryCode + "_nondeclarable.txt"));
        DutyAtDest_Page.tab_Prohibited().click();
        ObjectUtil.saveElementValue(DutyAtDest_Page.items_Prohibited(), new File(Constant.TestData_Path + "\\" + ctryCode + "_prohibited.txt"));
        DutyAtDest_Page.tab_Restricted().click();
        ObjectUtil.saveElementValue(DutyAtDest_Page.items_Restricted(), new File(Constant.TestData_Path + "\\" + ctryCode + "_restricted.txt"));
        BrowserUtil.closeBrowser();
    }
}
