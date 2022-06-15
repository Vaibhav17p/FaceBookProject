package pomClasessFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFB {
	
	//span[text()='Vãîbhåv Párhâd']
	
	@FindBy (xpath="//div[@class='j83agx80 l9j0dhe7 gl4o1x5y lt9micmv']")
   private WebElement profileSee;

    @FindBy (xpath="//a[@aria-label='Marketplace']")
   private WebElement market;


    @FindBy (xpath="//a[@aria-label='Gaming'][1]")
    private WebElement gaming;

    //(//span[text()='Vehicles'])[2]
	
	@FindBy (xpath="//a[@aria-label='Watch']")
	private WebElement watch;
	
	@FindBy (xpath="//div[@aria-label='Edit notification settings']")
	private WebElement settings;

    @FindBy (xpath="//span[text()='Inbox']")
    private WebElement inbox;


    @FindBy (xpath="(//span[text()='Vehicles'])[2]")
    private WebElement vehicles;

    @FindBy (xpath="//input[@aria-label='Show notification dots']")
    private WebElement inboxnotificheck;
    
	@FindBy (xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	
	public HomePageFB(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	
	}
	
	public void clickOnProfile()
	{
	profileSee.click();
	}
	
	public void clickOnGames()
	{
	gaming.click();
	}

	public void clickOnMarket()
	{
	market.click();
	}
	
	public void clickOnLogout() throws InterruptedException
	{
	profileSee.click();
	Thread.sleep(2000);
	logout.click();
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
		public void clickOnInboxCheck()
		{
			
			settings.click();
			boolean result =inboxnotificheck.isSelected();
			if(result==true)
			{
				System.out.println("TRUE");
			}
			else
			{System.out.println("FALSE");
			inboxnotificheck.click();}
			
			
		}
	
	}
