package com.Shopperstack_PriyankaS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ss_proj_pom_home_3 {

	public ss_proj_pom_home_3(WebDriver driver) {
		
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(xpath = "//span[contains(@class,'BaseBadge-badge')]")
	private WebElement accountSettings;
	
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement MyProfileSettings;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement LogOutSettings;

	public WebElement getAccountSettings() {
		return accountSettings;
	}

	public WebElement getMyProfileSettings() {
		return MyProfileSettings;
	}

	public WebElement getLogOutSettings() {
		return LogOutSettings;
	}

	

}
