package com.Shopperstack_PriyankaS_testScript;


import java.io.IOException;

import org.openqa.selenium.WebDriver.Window;
import org.testng.annotations.Test;

import com.Shopperstack_Generic_Utility.Base_Test;
import com.Shopperstack_PriyankaS_POM.ss_proj_pom_myaddressBtn_5;
import com.Shopperstack_PriyankaS_POM.ss_proj_pom_myaddresss_4;

public class TC_002_Verify_userable_to_delete_address_or_not_Test extends Base_Test{
	
	@Test
	public void deleteAddress() throws IOException, InterruptedException
	{
		
		homepage.getAccountSettings().click();
		homepage.getMyProfileSettings().click();
		Thread.sleep(3000);

		ss_proj_pom_myaddresss_4 myprofilepage=new ss_proj_pom_myaddresss_4(driver);
		myprofilepage.getMyAddressBtn().click();
		
		Thread.sleep(3000);
		ss_proj_pom_myaddressBtn_5 deleteAddress=new ss_proj_pom_myaddressBtn_5(driver);
		Thread.sleep(3000);

		deleteAddress.getDeleteBtn().click();
		Thread.sleep(3000);

		deleteAddress.getYesBtn().click();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		webdriver_utility.takeWebPageScreenShot();
	}
	

}
