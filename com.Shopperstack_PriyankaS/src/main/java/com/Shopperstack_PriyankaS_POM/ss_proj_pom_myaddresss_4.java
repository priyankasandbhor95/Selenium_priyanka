package com.Shopperstack_PriyankaS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ss_proj_pom_myaddresss_4 {

	public ss_proj_pom_myaddresss_4(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//div[contains(text(),'My Addresses')]")
	private WebElement myAddressBtn;

	public WebElement getMyAddressBtn() {
		return myAddressBtn;
	}

	
	
	

}
                  