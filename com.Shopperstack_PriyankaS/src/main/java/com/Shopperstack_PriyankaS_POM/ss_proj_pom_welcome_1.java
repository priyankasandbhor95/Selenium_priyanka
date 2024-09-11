package com.Shopperstack_PriyankaS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ss_proj_pom_welcome_1 {

	public ss_proj_pom_welcome_1(WebDriver driver) {
		PageFactory.initElements(driver,this);	
}
	
	@FindBy(id = "loginBtn")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	


}
