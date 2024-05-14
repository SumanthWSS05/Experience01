package org.elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/***
 * This is POM class of login page
 * @author Veerana Gouda
 *
 */
public class Login_Page {
	
	//initialization
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//WeBElements of login page
		@FindBy(xpath = "//button[text()='Shopper Login']")
		private WebElement ShopperLoginButton;
		@FindBy(id="Email")
		private WebElement emailtextfield;
		@FindBy(id="Password")
		private WebElement passwordTextField;
		@FindBy(xpath="//span[text()='Login']")
		private WebElement liginButton;
		
		//utilization	
		public WebElement getShopperLoginButton() {
			return ShopperLoginButton;
		}

		public WebElement getEmailtextfield() {
			return emailtextfield;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLiginButton() {
			return liginButton;
		}
		
		
		//Actions Methods on Login page
		public void loginMethod(String email,String password) {
			ShopperLoginButton.click();
			emailtextfield.sendKeys(email);
			passwordTextField.sendKeys(password);
			liginButton.click();

		}


}
