package org.elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author 91911 Bharath
 */
public class MyAddress_Page {

	public MyAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement Add_Address_button;
	@FindBy(id = "Home")
	private WebElement Home_radio_button;
	@FindBy(id = "Office")
	private WebElement Office_radio_button;
	@FindBy(id = "Other")
	private WebElement Other_radio_button;
	@FindBy(xpath = "//input[@id='Name']")
	private WebElement name_textfield;
	@FindBy(id = "Pincode")
	private WebElement pincode;
	@FindBy(id = "Other")
	private WebElement Add_new_address;

	
	// Utilization
	public WebElement getAdd_Address_button() {
		return Add_Address_button;
	}

	public WebElement getHome_radio_button() {
		return Home_radio_button;
	}

	public WebElement getOffice_radio_button() {
		return Office_radio_button;
	}

	public WebElement getOther_radio_button() {
		return Other_radio_button;
	}

	public WebElement getName_textfield() {
		return name_textfield;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getAdd_new_address() {
		return Add_new_address;
	}

	// Actions or methods of Webelement

	public void Add_Address_button() {
		Add_Address_button.click();
	}

	public void Home_radio_button() {
		Home_radio_button.click();
	}

	public void Office_radio_button() {
		Office_radio_button.click();
	}

	public void name_textfield(String Name) {
		name_textfield.sendKeys(Name);
	}

	public void pincode() {
		pincode.click();
	}

	public void Add_new_address(String Address) {
		Add_new_address.sendKeys(Address);
	}

}
