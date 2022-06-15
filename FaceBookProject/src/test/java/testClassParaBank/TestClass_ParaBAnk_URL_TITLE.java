package testClassParaBank;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pOMClass_ParaBAnk.HomePage_Para;
import pOMClass_ParaBAnk.LogintoPara;

public class TestClass_ParaBAnk_URL_TITLE {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		LogintoPara logintopara=new LogintoPara(driver);
		Thread.sleep(2000);
		logintopara.sendEmailId();
		
		logintopara.sendPassword();
		Thread.sleep(2000);
		logintopara.loginClick();
		
		//test1
		HomePage_Para homepagepara=new HomePage_Para(driver);
		
		homepagepara.productsClick();
		String url = driver.getCurrentUrl();
		String title= driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		if((url.equals("https://www.parasoft.com/products/") && title.equals("Automated Software Testing Tool Suite | Parasoft")))
		{
	    System.out.println("Pass");
		}
		else
        {
	    System.out.println("Fail");
        }
		
		
	
		//test2
		
//		logintopara.sendEmailId();
//		
//		logintopara.sendPassword();
//		Thread.sleep(2000);
//		logintopara.loginClick();
//
//		homepagepara.adminClick();
//		 url = driver.getCurrentUrl();
//	     title= driver.getTitle();
//	     System.out.println(url);
//		 System.out.println(title);
//		if((url.equals("https://www.parasoft.com/products/") && title.equals("Automated Software Testing Tool Suite | Parasoft")))
//		{
//	    System.out.println("Pass");
//		}
//		else
//        {
//	    System.out.println("Fail");
//        }
}
}