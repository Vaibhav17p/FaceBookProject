package pOMClass_ParaBAnk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Para {
	
	

	@FindBy(xpath="(//a[text()='Products'])[1]")
	WebElement products;
	@FindBy(xpath="//a[text()='Admin Page']")
	WebElement adminp;
	@FindBy(xpath="(//a[text()='About Us'])[1]")
	WebElement abtus;

	
	public HomePage_Para(WebDriver driver)// to pass browser from testclass to pomclass
	{
		  PageFactory.initElements(driver, this);// driver2> driver = new ChromeDriver
	}
	
	public void productsClick()
	{
		products.click();
	}
	
	public void adminClick()
	{
		adminp.click();
	}
	public void aboutusClick()
	{
		abtus.click();
	}
	
}

