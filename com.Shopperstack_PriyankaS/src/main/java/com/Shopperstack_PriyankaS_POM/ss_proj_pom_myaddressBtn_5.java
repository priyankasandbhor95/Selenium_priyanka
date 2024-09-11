package com.Shopperstack_PriyankaS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ss_proj_pom_myaddressBtn_5 {

	public ss_proj_pom_myaddressBtn_5(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addBtn;
	public WebElement getAddBtn() {
		return addBtn;
	}
	
	@FindBy(xpath = "(//span[@class=\"MuiButton-startIcon MuiButton-iconSizeSmall css-u0g51i\"])[2]")
	private WebElement deleteBtn;
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;
	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	

}
