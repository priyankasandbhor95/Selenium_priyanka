package com.Shopperstack_PriyankaS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ss_proj_pom_login_2 {

	public ss_proj_pom_login_2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id= "Email")
	private WebElement EmailText;
	
	@FindBy(id = "Password")
	private WebElement PasswordText;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement LoginButton;

	public WebElement getEmailText() {
		return EmailText;
	}

	public WebElement getPasswordText() {
		return PasswordText;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	


}
