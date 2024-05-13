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

public class WishList_Page {

	// initialization
	public WishList_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// identification Of WebElement of WishList Page
	@FindBy(xpath = "//div[@class='wishlist_prodDetails__NDgZy']/h2")
	private WebElement wishListProduct;
	@FindBy(xpath = "//button[text()='remove from wishlist?']")
	private WebElement removeFromWishList;

	// utilization of Wish List page WebElement
	public WebElement getWishListProduct() {
		return wishListProduct;
	}

	public WebElement getRemoveFromWishList() {
		return removeFromWishList;
	}
	
	//Actions Methods on WishList WebElement 
	public void removeFromWishList()
	{
		removeFromWishList.click();
	}

}
