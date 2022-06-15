package testNG_Flipkart01;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import broWser.Base;
import pOmClass_Flipkart.Home_Flipkart_Vaibhav;
import pOmClass_Flipkart.LoginFlipkart;
import pOmClass_Flipkart.LogoutFlipkart;
import utils.Utility;

public class Flipkart_testNG_Home {
	int i;
	WebDriver driver;
	LoginFlipkart logintoflipkart;
	LogoutFlipkart logoutflipkart;
	Home_Flipkart_Vaibhav homeflipkartvaibhav;
	String url;
	String title;
	SoftAssert soft;
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
	public void browserLaunch() 
	{
		homeflipkartvaibhav=new Home_Flipkart_Vaibhav(driver);
		LoginFlipkart logintoflipkart=new LoginFlipkart(driver);
		LogoutFlipkart logoutflipkart=new LogoutFlipkart(driver);
	}
	@BeforeMethod
	public void login() throws InterruptedException 
	{
		driver.get("https://www.flipkart.com/");
		logintoflipkart=new LoginFlipkart(driver);
		Thread.sleep(2000);
		logintoflipkart.sendEmailId();
		logintoflipkart.sendPassword();
		Thread.sleep(2000);
		logintoflipkart.loginClick();
	}
	@Test
	public void myProfile() throws InterruptedException 
	{
		homeflipkartvaibhav=new Home_Flipkart_Vaibhav(driver);

		Thread.sleep(2000);
		homeflipkartvaibhav.movetoVaibhav(driver);
		//Thread.sleep(2000);
		homeflipkartvaibhav.clickOnMyProfile();
		//Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String title= driver.getTitle();
		Thread.sleep(2000);	
		System.out.println(url);
		Thread.sleep(2000);	
		System.out.println(title);
		Thread.sleep(2000);
		boolean result = url.equals("https://www.flipkart.com/account/?rd=0&link=home_account");
//		Assert.assertTrue(result);
//    	result =title.equals("My Profile");
//    	Assert.assertTrue(result);
		soft = new SoftAssert();
		soft.assertTrue(result);
		result =title.equals("My Profile");
		soft.assertFalse(result);
		soft.assertAll();
	    
	}
	
//

	
	@Test
	public void orders() throws InterruptedException 
	{
		Thread.sleep(3000);
		homeflipkartvaibhav.movetoVaibhav(driver);
		Thread.sleep(2000);
		homeflipkartvaibhav.clickOnorders();
		Thread.sleep(2000);
		url = driver.getCurrentUrl();
		title= driver.getTitle();
		Thread.sleep(2000);	
		System.out.println(url);
		Thread.sleep(2000);	
		System.out.println(title);
		Thread.sleep(2000);
		boolean result = url.equals("https://www.flipkart.com/account/orders?link=home_orders");
		soft = new SoftAssert();
		soft.assertTrue(result);
		result =title.equals("Flipkart.com: Your Order History");
		soft.assertTrue(result);
		soft.assertAll();
//		Assert.assertTrue(result);
//    	result =title.equals("Flipkart.com: Your Order History");
//    	Assert.assertTrue(result);		

	}
	

	@Test
	public void wishlist() throws InterruptedException 
	{
		
		Thread.sleep(1000);
		homeflipkartvaibhav.movetoVaibhav(driver);
		Thread.sleep(2000);
		homeflipkartvaibhav.clickOnwishlist();
		Thread.sleep(2000);
		 url = driver.getCurrentUrl();
		 title= driver.getTitle();
		 Thread.sleep(2000);	
		System.out.println(url);
		Thread.sleep(2000);	
		System.out.println(title);
		Thread.sleep(2000);
		boolean result = url.equals("https://www.flipkart.com/wishlist?link=home_wishlist");
		soft = new SoftAssert();
		soft.assertTrue(result);
		result =title.equals("My Wishlist");
		soft.assertTrue(result);
		soft.assertAll();
//		Assert.assertTrue(result);
//    	result =title.equals("My Wishlist");
//    	Assert.assertTrue(result);	
	}

	@Test
	public void mychats() throws InterruptedException 
	{
		Thread.sleep(3000);
		homeflipkartvaibhav.movetoVaibhav(driver);
		Thread.sleep(2000);
		homeflipkartvaibhav.clickOnMychats();
		Thread.sleep(2000);
		url = driver.getCurrentUrl();
	    title= driver.getTitle();
		Thread.sleep(2000);	
		System.out.println(url);
		Thread.sleep(2000);	
		System.out.println(title);
		Thread.sleep(2000);
		boolean result = url.equals("https://www.flipkart.com/my-chats?link=home_chat");
		soft = new SoftAssert();
		soft.assertTrue(result);
		result =title.equals("My Chats");
		soft.assertTrue(result);
		soft.assertAll();
//		Assert.assertTrue(result);
//    	result =title.equals("My Chats");
//    	Assert.assertTrue(result);	

	}

	@AfterMethod
	public void logOut (ITestResult result) throws InterruptedException, IOException 
	
	{   i++;  
	    if(result.FAILURE==result.getStatus())
	    {
	    	Utility.captureScreenShot(driver, i);
	    }
		logoutflipkart=new LogoutFlipkart(driver);
	    Thread.sleep(4500);	
		logoutflipkart.movetOMyName(driver);
		Thread.sleep(4500);
		logoutflipkart.clikonLOgOut();
			
	}
	@AfterClass
	public void clearObjects() 
	{   logintoflipkart=null;
		logoutflipkart=null;
		homeflipkartvaibhav=null;
		
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	
	{Thread.sleep(1000);
		driver.close();
		driver= null;
		System.gc(); // garbage remove object ref
	}
	

	
}







//if((url.equals("https://www.flipkart.com/account/?rd=0&link=home_account") && title.equals("My Profile")))
//{
//System.out.println("Pass");
//}
//else
//{
//System.out.println("Fail");
//}

//
//if((url.equals("https://www.flipkart.com/my-chats?link=home_chat") && title.equals("My Chats")))
//{
//System.out.println("Pass");
//}
//else
//{
//System.out.println("Fail");
//}
//

//if((url.equals("https://www.flipkart.com/wishlist?link=home_wishlist") && title.equals("My Wishlist")))
//{
//System.out.println("Pass");
//}
//else
//{
//System.out.println("Fail");
//}
//

//if((url.equals("https://www.flipkart.com/account/orders?link=home_orders") && title.equals("Flipkart.com: Your Order History")))
//{
//System.out.println("Pass");
//}
//else
//{
//System.out.println("Fail");
//}






//@Test
//public void fkplus() throws InterruptedException 
//{
//	Thread.sleep(3000);
//	homeflipkartvaibhav.movetoVaibhav(driver);
//	Thread.sleep(1000);
//	homeflipkartvaibhav.clickOnPlus();
//	Thread.sleep(2000);
//	url = driver.getCurrentUrl();
//	title= driver.getTitle();
//	Thread.sleep(2000);	
//	System.out.println(url);
//	Thread.sleep(2000);	
//	System.out.println(title);
//	Thread.sleep(2000);
//	boolean result = url.equals("https://www.flipkart.com/plus");
//	Assert.assertTrue(result);
//	result =title.equals("Flipkart Plus – The Ultimate Rewards Program for Flipkart Customers | Flipkart.com");
//	Assert.assertTrue(result);
//	if((url.equals("https://www.flipkart.com/plus") && title.equals("Flipkart Plus – The Ultimate Rewards Program for Flipkart Customers | Flipkart.com")))
//	{
//    System.out.println("Pass");
//	}
//	else
//    {
//    System.out.println("Fail");
//    }

	
//}