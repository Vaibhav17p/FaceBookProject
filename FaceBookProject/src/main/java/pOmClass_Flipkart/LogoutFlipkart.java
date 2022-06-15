package pOmClass_Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutFlipkart {
	
	
	

	@FindBy(xpath="//div[text()='Vaibhav']")
	private WebElement movetovaibs;
	
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logout;

	WebDriver driver;
	public LogoutFlipkart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public  void movetOMyName(WebDriver driver) throws InterruptedException
	{
		
		Actions act= new Actions(driver);
		act.moveToElement(movetovaibs).perform();
		
		
		
		//
		
	}
		public void clikonLOgOut() throws InterruptedException
	    {
		Thread.sleep(2000);
		logout.click();
		}
}
