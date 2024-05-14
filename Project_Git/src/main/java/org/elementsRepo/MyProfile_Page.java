package org.elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author 91911 Bharath
 */
public class MyProfile_Page {

	public MyProfile_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement My_profile;

	// Utilization

	public WebElement getMy_profile() {
		return My_profile;
	}

	// Actions or methods of Webelement
	public void particular() {
		My_profile.click();
	}

}
