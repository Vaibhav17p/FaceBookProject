package pOmClass_Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Flipkart_Vaibhav {
	
	@FindBy(xpath="//div[text()='Vaibhav']")
	private WebElement vaibhav;
	@FindBy(xpath="//div[text()='My Profile']")
	private WebElement myprofile;
	
	@FindBy(xpath="//div[text()='SuperCoin Zone']")
	private WebElement coinzone;
	
	
	//div[text()='Flipkart Plus Zone']
	@FindBy(xpath="//div//li[3]")
	private WebElement fplus;
	
	@FindBy(xpath="//div[text()='Orders']")
	private WebElement orders;
	@FindBy(xpath="//div[text()='Wishlist']")
	private WebElement wishlist;
	@FindBy(xpath="//div[text()='My Chats']")
	private WebElement mychats;                      
	@FindBy(xpath="//div[text()='Coupons']")
	private WebElement coupn;                  
	@FindBy(xpath="//div[text()='Gift Cards']")
	private WebElement giftcard;
	@FindBy(xpath="//div[text()='Notifications']")
	private WebElement noti;
	
		public Home_Flipkart_Vaibhav(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickOnMyProfile() 
		{
			myprofile.click();
		}
	
		public void clickOnCoin() 
		{
			coinzone.click();
		}
		public void clickOnPlus() throws InterruptedException
		{
			
			fplus.click();
		}

		public void clickOnorders() 
		{
			orders.click();
		}
		public void clickOnwishlist()
		{
			wishlist.click();
		}
		public void movetoVaibhav(WebDriver driver) 
		{
			Actions act= new Actions(driver);
			act.moveToElement(vaibhav).perform();
		}
		public void clickOnGift() 
		{
			giftcard.click();
		}
	
		public void clickOnMychats() 
		{
			mychats.click();
		}
		public void clickOnMyCoupons() 
		{
			coupn.click();
		}

		public void clickOnNotify() 
		{
			noti.click();
		}
}

