package org.elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Admin Tanmay
 *
 */
class Cart_Page {

	// initialization
	public Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// identification of Cart page WebElement
	@FindBy(xpath = "//button[text()='Remove from cart']")
	private WebElement removeFromCart_Button;
	@FindBy(xpath = "//div[@class='cart_quantity__Eg+qv']/descendant::span")
	private WebElement productQty_Icon;
	@FindBy(xpath = "//span[text()='Buy Now']")
	private WebElement buyNow_Button;

	// utilization of Cart Page WebElement
	public WebElement getRemoveFromCart_Button() {
		return removeFromCart_Button;
	}

	public WebElement getProductQty_Icon() {
		return productQty_Icon;
	}

	public WebElement getBuyNow_Button() {
		return buyNow_Button;
	}

	// Actions Methods of Cart Page WebElemenet
	public void clickOnRemoveFromCart_Button() {
		removeFromCart_Button.click();
	}

	public void clickOnProductQty() {
		productQty_Icon.click();
	}

	public void clickOnBuyNow() {
		buyNow_Button.click();
	}

}
