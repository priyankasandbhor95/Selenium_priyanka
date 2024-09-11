package com.Shopperstack_PriyankaS_testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Shopperstack_Generic_Utility.Base_Test;
import com.Shopperstack_PriyankaS_POM.ss_proj_pom_addAdressDetails_6;
import com.Shopperstack_PriyankaS_POM.ss_proj_pom_myaddressBtn_5;
import com.Shopperstack_PriyankaS_POM.ss_proj_pom_myaddresss_4;
import com.aventstack.extentreports.Status;

public class TC_001_Verify_userable_to_add_address_or_not_Test extends Base_Test {
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test=reports.createTest("addAddress");
		test.log(Status.PASS, "Login Successfully");
	
		homepage.getAccountSettings().click();
		homepage.getMyProfileSettings().click();
		
		test.log(Status.INFO, "Navigate to my profile page");
		
		ss_proj_pom_myaddresss_4 myProfile=new ss_proj_pom_myaddresss_4(driver);
		myProfile.getMyAddressBtn().click();
		test.log(Status.INFO, "Navigate to my Address page");
		
		ss_proj_pom_myaddressBtn_5 myaddressButton=new ss_proj_pom_myaddressBtn_5(driver);
		myaddressButton.getAddBtn().click();

		
		test.log(Status.INFO, "Navigate to my Address Form Page");
		
		ss_proj_pom_addAdressDetails_6 addFormpage=new ss_proj_pom_addAdressDetails_6(driver);
		addFormpage.getAddressTypeRadioBtn().click();
		
		addFormpage.getNameTF().sendKeys(file_Uti.readExcelData("Sheet1", 1, 0));
		addFormpage.getHouseInfoTF().sendKeys(file_Uti.readExcelData("Sheet1", 1, 1));
		addFormpage.getStreetInfoTF().sendKeys(file_Uti.readExcelData("Sheet1", 1, 2));
		addFormpage.getLandmarkTF().sendKeys(file_Uti.readExcelData("Sheet1", 1, 3));
		
		webdriver_utility.selectByValue(addFormpage.getCountryDropDown(), file_Uti.readExcelData("Sheet1", 1, 4));
		webdriver_utility.selectByValue(addFormpage.getStateDropDown(), file_Uti.readExcelData("Sheet1", 1, 5));
		webdriver_utility.selectByValue(addFormpage.getCityDropDown(), file_Uti.readExcelData("Sheet1", 1, 6));

		addFormpage.getPincodeTF().sendKeys(file_Uti.readExcelData("Sheet1", 1, 7));
		addFormpage.getPhoneNumberTF().sendKeys(file_Uti.
				readExcelData("Sheet1", 1, 8));
		addFormpage.getAddAddressBtn().click();

		Thread.sleep(3000);
		webdriver_utility.takeWebPageScreenShot();
	}

}
