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

public class Welcome_Page {
	
	
	
	//initialization
	public Welcome_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//identification of WebElement from Welcome page
	@FindBy(id="loginBtn")
	private WebElement Login_Button;
	@FindBy(id="kids")
	private WebElement Kids_Product_Link;
	
	
	//utilization of WebElement from Welcome Page
	public WebElement getLogin_Button() {
		return Login_Button;
	}
	public WebElement getKids_Product_Link() {
		return Kids_Product_Link;
	}
	
	
	//operational methods on Welcome page WebElement 
	public void click_on_loginButton()
	{
		Login_Button.click();
	}
	
	public void click_on_kidsPip()
	{
		Kids_Product_Link.click();
	}

}
