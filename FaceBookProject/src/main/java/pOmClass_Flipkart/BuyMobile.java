package pOmClass_Flipkart;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyMobile {

	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchbar;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement firstitem;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement buynow;
	@FindBy(xpath="(//div[@class='_1XFPmK'])[2]")
	private WebElement buttonaddrpune;
	
	WebDriver driver;
	public BuyMobile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchAnything() throws InterruptedException {
		searchbar.sendKeys("Mobile Oneplus");
		Thread.sleep(1000);
		searchButton.click();
		
		}
    public void clickOn1stiTem() {
    	firstitem.click();
    }
        public void clickOnBuynow(WebDriver driver) throws InterruptedException, IOException {
//    	
    	ArrayList<String> mobile1= new ArrayList<String> (driver.getWindowHandles());
    	String addofChild= mobile1.get(1);
    	System.out.println(addofChild);
    	Thread.sleep(2000);
    	driver.switchTo().window(addofChild);
    	buynow.click();
    	driver.manage().window().maximize(); 	
    }
        public void clickonaddress() {
        	
        	boolean result= buttonaddrpune.isSelected();
        	if(result==true)
        	{
        	 System.out.println("Address is Correct");
        	}
        	else {
        		
        		buttonaddrpune.click();
        		System.out.println("Now selected");
        	}	
        }
       public void mainpage(WebDriver driver) throws InterruptedException {
    	   ArrayList<String> mobile1= new ArrayList<String> (driver.getWindowHandles());
       	String parentPage= mobile1.get(0);
    
       	Thread.sleep(2000);
    	   driver.switchTo().window(parentPage);
       }
        
}
