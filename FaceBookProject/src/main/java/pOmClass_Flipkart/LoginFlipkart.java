package pOmClass_Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlipkart {
	

	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginmove;
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement mail;
	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	private WebElement password;
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement login;

	public LoginFlipkart(WebDriver driver)// to pass browser from testclass to pomclass
	{
	  PageFactory.initElements(driver, this);// driver2> driver = new ChromeDriver
	}

	public void sendEmailId() {
	mail.sendKeys("9503293096");
	}

	public void sendPassword() {
	password.sendKeys("9503293096");
		}
	public void loginClick() {
		
	login.click();
	}

}
