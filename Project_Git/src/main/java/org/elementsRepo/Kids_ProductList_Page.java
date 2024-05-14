package org.elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author 91911 Bharath
 */
public class Kids_ProductList_Page {

	
	public Kids_ProductList_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// WebElements
	@FindBy(xpath = "(//button[text()='add to cart']/../*[local-name()='svg'])[1]']")
	private WebElement wishlisticon;

	@FindBy(xpath = "//span[text()='santoor']")
	private WebElement particularproduct;

	// Utilization
	public WebElement getWishlisticon() {
		return wishlisticon;
	}

	public WebElement getParticularproduct() {
		return particularproduct;
	}

	// Actions or methods of Webelement
	public void particular() {
		particularproduct.click();
	}

	public void wishlisticon() {
		wishlisticon.click();
	}
}
