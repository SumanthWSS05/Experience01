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
public class Home_Page {

	// initialization
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// identification of WebElement of Home Page
	@FindBy(id = "cart")
	private WebElement CartButton;
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement AccountSettingIcon;
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement MyProfileLink;
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement wishListLink;
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement LogoutLink;
	@FindBy(className = "chatbot")
	private WebElement messageUsButton;
	@FindBy(xpath = "//span[text()='Message Us']")
	private WebElement messageUsPopUp;
	@FindBy(xpath = "//main[@id='main_chat_scrolling']/article/h2")
	private WebElement MessageUsWelComePageMessageText;
	@FindBy(xpath = "//p[@class='agent_chat_style']/span")
	private WebElement MessageUsResponse;
	@FindBy(id = "chat_input")
	private WebElement MessageUsTextField;
	@FindBy(xpath = "//span[@class='chat_send_arrow']")
	private WebElement MessageUsSendIconArrow;

	
	
	// utilization of Home page WebElement
	public WebElement getCartButton() {
		return CartButton;
	}

	public WebElement getAccountSettingIcon() {
		return AccountSettingIcon;
	}

	public WebElement getMyProfileLink() {
		return MyProfileLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getMessageUsButton() {
		return messageUsButton;
	}

	public WebElement getMessageUsPopUp() {
		return messageUsPopUp;
	}

	public WebElement getMessageUsWelComePageMessageText() {
		return MessageUsWelComePageMessageText;
	}

	public WebElement getMessageUsResponse() {
		return MessageUsResponse;
	}

	public WebElement getMessageUsTextField() {
		return MessageUsTextField;
	}

	public WebElement getMessageUsSendIconArrow() {
		return MessageUsSendIconArrow;
	}
	
	
	//Actions Methods On WebElement of HomePage 
	
	public void logOut()
	{
		LogoutLink.click();
	}
	
	public void clickOnAccountSetting()
	{
		AccountSettingIcon.click();
	}
	
	public void clickOnCartIcon()
	{
		CartButton.click();
	}
	
	public void clickOnMyProfile()
	{
		MyProfileLink.click();
	}
	
	public void clickOnWishList()
	{
		wishListLink.click();
	}

}
