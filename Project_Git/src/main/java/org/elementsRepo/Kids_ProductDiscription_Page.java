package org.elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author 91911 Bharath
 */
public class Kids_ProductDiscription_Page {

	public Kids_ProductDiscription_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(id = "compare")
	private WebElement compareIcon;
	@FindBy(id = "Check Delivery")
	private WebElement Check_Delivery_TextBox;
	@FindBy(id = "Check")
	private WebElement Check;

	// utilization

	public WebElement getCompareIcon() {
		return compareIcon;
	}

	public WebElement getCheck_Delivery_TextBox() {
		return Check_Delivery_TextBox;
	}

	public WebElement getCheck() {
		return Check;
	}

	// Actions or methods of Webelement
	public void compareIcon() {
		compareIcon.click();
	}

	public void Check_Delivery_TextBox(String pincode) {
		Check_Delivery_TextBox.sendKeys(pincode);
	}

	public void check() {
		Check.click();
	}

}
