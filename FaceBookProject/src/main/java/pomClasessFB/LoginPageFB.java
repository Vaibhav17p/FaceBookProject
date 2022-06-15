package pomClasessFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFB {
	
	


	
	@FindBy (xpath="//input[@placeholder='Email address or phone number']")
	private WebElement emailiD ;
	
		
	@FindBy (xpath="//input[@type='password']")
	private WebElement password ;

	
	@FindBy (xpath=	"//button[text()='Log In']")
	private WebElement login ;

  public LoginPageFB(WebDriver driver)// to pass browser from testclass to pomclass
  {
	  PageFactory.initElements(driver, this);// driver2> driver = new ChromeDriver
  }
  
  public void sendEmailId() {
	  emailiD.sendKeys("vaibhavparhad@gmail.com");
  }

  public void sendPassword() {
	  password.sendKeys("h1005401664");
  }
  
  public void clickonSigin() {
	  login.click();
  }
  
  
  
  
  
}


