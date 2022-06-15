package pOMClass_ParaBAnk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogintoPara {


	
	@FindBy(xpath="//input[@name='username']")
	WebElement mail;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement login;

public LogintoPara(WebDriver driver)// to pass browser from testclass to pomclass
{
	  PageFactory.initElements(driver, this);// driver2> driver = new ChromeDriver
}

//public void clickOn_Login() throws InterruptedException
//{
//	mail.sendKeys("vaibhav1664");
//	password.sendKeys("Vap@8055");
//	Thread.sleep(2000);
//	login.click();
//	
//	}

public void sendEmailId() {
	mail.sendKeys("vaibhav1996");
}

public void sendPassword() {
	password.sendKeys("17@Vap8055");
}
public void loginClick() {
	login.click();
}
}
	

