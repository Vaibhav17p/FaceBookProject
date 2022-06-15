
package testClass_Flipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pOmClass_Flipkart.BuyMobile;
import pOmClass_Flipkart.Home_Flipkart_Vaibhav;
import pOmClass_Flipkart.LoginFlipkart;
import pOmClass_Flipkart.LogoutFlipkart;
import pOmClass_Flipkart.TakeScreenShot;


public class TestClass_Flipkart_URL_TITLE {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
	   System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver61.exe");
	
	   WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		//LOGIN
		LoginFlipkart logintoflipkart=new LoginFlipkart(driver);
		Thread.sleep(2000);
		
		logintoflipkart.sendEmailId();
		logintoflipkart.sendPassword();
		Thread.sleep(2000);
		logintoflipkart.loginClick();
		
		//LOGOUT
		LogoutFlipkart logoutflipkart = new LogoutFlipkart(driver);
		Home_Flipkart_Vaibhav homeflipkartvaibhav=new Home_Flipkart_Vaibhav(driver);
		TakeScreenShot screenshot= new TakeScreenShot(driver);

		//test1
		
		
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
		if((url.equals("https://www.flipkart.com/account/?rd=0&link=home_account") && title.equals("My Profile")))
		{
	    System.out.println("Pass");
		}
		else
        {
	    System.out.println("Fail");
        }	
        Thread.sleep(3000);	
		logoutflipkart.movetOMyName(driver);
		Thread.sleep(2000);
		logoutflipkart.clikonLOgOut();
		
		
	
		//test2
		Thread.sleep(3000);
		logintoflipkart.sendEmailId();
		logintoflipkart.sendPassword();
		Thread.sleep(2000);
		logintoflipkart.loginClick();
		//Home_Flipkart_Vaibhav homeflipkartvaibhav=new Home_Flipkart_Vaibhav(driver);
		
		Thread.sleep(3000);
		homeflipkartvaibhav.movetoVaibhav(driver);
		Thread.sleep(2000);
		homeflipkartvaibhav.clickOnPlus();
		Thread.sleep(2000);
		 url = driver.getCurrentUrl();
		 title= driver.getTitle();
		 Thread.sleep(2000);	
		System.out.println(url);
		Thread.sleep(2000);	
		System.out.println(title);
		Thread.sleep(2000);
		if((url.equals("https://www.flipkart.com/plus") && title.equals("Flipkart Plus – The Ultimate Rewards Program for Flipkart Customers | Flipkart.com")))
		{
	    System.out.println("Pass");
		}
		else
        {
	    System.out.println("Fail");
        }
		
		Thread.sleep(2000);	
		logoutflipkart.movetOMyName(driver);
		Thread.sleep(2000);
		logoutflipkart.clikonLOgOut();
		
		//test 3
		logintoflipkart.sendEmailId();
		logintoflipkart.sendPassword();
		Thread.sleep(2000);
		logintoflipkart.loginClick();
		
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
		if((url.equals("https://www.flipkart.com/account/orders?link=home_orders") && title.equals("Flipkart.com: Your Order History")))
		{
	    System.out.println("Pass");
		}
		else
        {
	    System.out.println("Fail");
        }
		Thread.sleep(2000);	
		logoutflipkart.movetOMyName(driver);
		Thread.sleep(2000);
		logoutflipkart.clikonLOgOut();
		
		//test 4
		
		logintoflipkart.sendEmailId();
		logintoflipkart.sendPassword();
		Thread.sleep(2000);
		logintoflipkart.loginClick();
		Thread.sleep(3000);
		
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
		if((url.equals("https://www.flipkart.com/wishlist?link=home_wishlist") && title.equals("My Wishlist")))
		{
	    System.out.println("Pass");
		}
		else
        {
	    System.out.println("Fail");
        }
		Thread.sleep(2000);	
		logoutflipkart.movetOMyName(driver);
		Thread.sleep(3000);
		logoutflipkart.clikonLOgOut();
		
		
		//test 5
		
		logintoflipkart.sendEmailId();
		logintoflipkart.sendPassword();
		Thread.sleep(2000);
		logintoflipkart.loginClick();
		
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
		if((url.equals("https://www.flipkart.com/my-chats?link=home_chat") && title.equals("My Chats")))
		{
	    System.out.println("Pass");
		}
		else
        {
	    System.out.println("Fail");
        }
		Thread.sleep(2000);	
		logoutflipkart.movetOMyName(driver);
		Thread.sleep(3000);
		logoutflipkart.clikonLOgOut();
		
		//test3-> check searched products and pop up window handling
		
//		BuyMobile buymobile= new BuyMobile(driver);
//		buymobile.searchAnything();
//		buymobile.clickOn1stiTem();
//		buymobile.clickOnBuynow(driver);
//		
//		buymobile.clickonaddress();
//		screenshot.takeScreenshot(driver);
//		buymobile.mainpage(driver);
//		driver.navigate().refresh();
//		
		
		
		
}
}


