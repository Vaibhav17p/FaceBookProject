package testClasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import broWser.Base;
import pomClasessFB.HomePageFB;
import pomClasessFB.LoginPageFB;

public class VerifyHeadersFbTestNg {
	WebDriver driver;
	LoginPageFB loginpagefb;
	HomePageFB hompageFB;
	
	@Parameters ("browserName")
	
	@BeforeTest
	public void browserLaunch(String browser)
	{
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
			driver=Base.openChrome();
		}
		if(browser.equals("Firefox"))
		{
			driver=Base.openFireFox();
		}
		if(browser.equals("Edge"))
		{
			driver=Base.openEdge();
		}
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void pOmObjects()
	{
	
		LoginPageFB loginpagefb=new LoginPageFB(driver);
		HomePageFB hompageFB = new HomePageFB(driver);
		
		
	}
	@BeforeMethod
	public void loginPage() throws InterruptedException
	{   
		loginpagefb=new LoginPageFB(driver);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		loginpagefb.sendEmailId();
		loginpagefb.sendPassword();
		Thread.sleep(3000);
		loginpagefb.clickonSigin();
	}
	@Test (priority=5)
	public void testclassGaming() throws InterruptedException
	{
		Thread.sleep(3000);
		//hompageFB.clickOnProfile();
		hompageFB.clickOnGames();
		Thread.sleep(1000);
		String urlgame = driver.getCurrentUrl();
		String titlegame=driver.getTitle();
		Thread.sleep(3000);
		System.out.println(titlegame);
		System.out.println(urlgame);
		//(19) Facebook Gaming | Watch live video game streaming | 
		Thread.sleep(2000);
		if(urlgame.equals("https://www.facebook.com/gaming/feed/")&&titlegame.equals("(3) Facebook Gaming | Watch live video game streaming | Facebook"))
				
		{
			//https://www.facebook.com/marketplace/?ref=app_tab
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}		

	}
 
	@Test (priority=2)
	public void testclassMarket() throws InterruptedException
	{
	
		//HomePageFB hompagefb1 = new HomePageFB(driver);
	    hompageFB = new HomePageFB(driver);
	    Thread.sleep(3000);
		hompageFB.clickOnMarket();
		Thread.sleep(1000);
		String urlmarket = driver.getCurrentUrl();
		String titlemarket=driver.getTitle();
		Thread.sleep(1000);
		System.out.println(titlemarket);
		System.out.println(urlmarket);
		Thread.sleep(3000);
		if(urlmarket.equals("https://www.facebook.com/marketplace/?ref=app_tab") && titlemarket.equals("(3) Facebook Marketplace | Facebook"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	}
	
	@Test (priority=1)
	//Run | Debug
	public void testclassInbocOn_Off() throws InterruptedException
	{
		
		hompageFB = new HomePageFB(driver);
		Thread.sleep(3000);
		hompageFB.clickOnMarket();
		Thread.sleep(2000);
		hompageFB.clickOninbox();
		Thread.sleep(1000);
		String urlinbox = driver.getCurrentUrl();
		String titleinbox=driver.getTitle();
		Thread.sleep(1000);
		System.out.println(titleinbox);
		System.out.println(urlinbox);
		Thread.sleep(3000);
		hompageFB.clickOnInboxCheck();
		

	}
	
	@AfterMethod
	public void logOut() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		HomePageFB hompageFB = new HomePageFB(driver);
//		TakesScreenshot ss= (TakesScreenshot)driver;
//		File source= ss.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\ADMIN\\Desktop\\Vaibs\\SS\\fb2.jpg");
//		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		hompageFB.clickOnLogout();
	}
	@AfterClass
	public void clearObject()// make object ref null afer use
	{
		loginpagefb= null;
		hompageFB=null;
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	
	{Thread.sleep(1000);
		driver.close();
		driver= null;
		System.gc(); // garbage remove object ref
	}
}

