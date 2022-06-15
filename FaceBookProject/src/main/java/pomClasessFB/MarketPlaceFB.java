package pomClasessFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPlaceFB {
	
	@FindBy (xpath="//div[@aria-label='Edit notification settings']")
    WebElement settings;

    @FindBy (xpath="//span[text()='Inbox']")
    WebElement inbox;


    @FindBy (xpath="(//span[text()='Vehicles'])[2]")
	WebElement vehicles;

    @FindBy (xpath="(//input[@type='checkbox'])[1]")
    WebElement inboxnotificheck;
    
    public MarketPlaceFB(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
    
    public void clickOnSettings()
	{
	settings.click();
	}
	
	public void clickOninbox()
	{
	inbox.click();
	}
	public void clickOnVehicles()
	{
	vehicles.click();
	}
	public void clickOnInboxNotiCheck()
	{
		inboxnotificheck.click();
		
	}



}
