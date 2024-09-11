package com.Shopperstack_PriyankaS_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ss_proj_pom_addAdressDetails_6 {

	public ss_proj_pom_addAdressDetails_6(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(id="Office")
	private WebElement addressTypeRadioBtn;

	
	@FindBy(id="Name")
	private WebElement nameTF;
	
	@FindBy(id="House/Office Info")
	private WebElement houseInfoTF ;
	
	@FindBy(id="Street Info")
	private WebElement streetInfoTF ;
	
	@FindBy(id="Landmark")
	private WebElement landmarkTF;
	
	@FindBy(id="Country")
	private WebElement countryDropDown;
	
	@FindBy(id="State")
	private WebElement stateDropDown;
	
	@FindBy(id="City")
	private WebElement cityDropDown;
	
	@FindBy(id="Pincode")
	private WebElement PincodeTF;
	
	@FindBy(id="Phone Number")
	private WebElement  phoneNumberTF;
	
	@FindBy(id = "btnDisabled")
	private WebElement disAddAddressBtn;
	
	@FindBy(id="addAddress")
	private WebElement addAddressBtn;
	

	public WebElement getAddressTypeRadioBtn() {
		return addressTypeRadioBtn;
	}

	public WebElement getNameTF() {
		return nameTF;
	}

	public WebElement getHouseInfoTF() {
		return houseInfoTF;
	}
	
	

	public WebElement getStreetInfoTF() {
		return streetInfoTF;
	}

	public WebElement getLandmarkTF() {
		return landmarkTF;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTF() {
		return PincodeTF;
	}

	public WebElement getDisAddAddressBtn() {
		return disAddAddressBtn;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

	public WebElement getPhoneNumberTF() {
		return phoneNumberTF;
	}
	

}
