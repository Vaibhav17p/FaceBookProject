package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasessFB.HomePageFB;
import pomClasessFB.LoginPageFB;

	public class VerifyingHeadersHompageFB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
	
			LoginPageFB loginpagefb= new LoginPageFB(driver);
			
			loginpagefb.sendEmailId();
			loginpagefb.sendPassword();
			loginpagefb.clickonSigin();
		
			HomePageFB hompageFB = new HomePageFB(driver);
			//hompageFB.clickOnProfile();
			hompageFB.clickOnGames();
			Thread.sleep(3000);
			String urlgame = driver.getCurrentUrl();
			Thread.sleep(3000);
			String titlegame=driver.getTitle();
			Thread.sleep(3000);
			System.out.println(titlegame);
			System.out.println(urlgame);
			//(19) Facebook Gaming | Watch live video game streaming | 
				
			if(urlgame.equals("https://www.facebook.com/gaming/feed/")&&titlegame.equals("(1) Facebook Gaming | Watch live video game streaming | Facebook"))
					
			{
				//https://www.facebook.com/marketplace/?ref=app_tab
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
			
			hompageFB.clickOnLogout();
			
			//Test2
			
			driver.get("https://www.facebook.com/");
			loginpagefb= new LoginPageFB(driver);
			loginpagefb.sendEmailId();
			loginpagefb.sendPassword();
			loginpagefb.clickonSigin();
		
			//HomePageFB hompagefb1 = new HomePageFB(driver);
			hompageFB = new HomePageFB(driver);
			hompageFB.clickOnMarket();
			Thread.sleep(1000);
			
			String urlmarket = driver.getCurrentUrl();
			String titlemarket=driver.getTitle();
			System.out.println(titlemarket);
			System.out.println(urlmarket);
			
			if(urlmarket.equals("https://www.facebook.com/marketplace/?ref=app_tab") && titlemarket.equals("(1) Facebook Marketplace | Facebook"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
			
			hompageFB.clickOnLogout();
			
			//Test 3

			driver.get("https://www.facebook.com/");
			loginpagefb= new LoginPageFB(driver);
			loginpagefb.sendEmailId();
			loginpagefb.sendPassword();
			loginpagefb.clickonSigin();
			hompageFB = new HomePageFB(driver);
			hompageFB.clickOnMarket();
			Thread.sleep(1000);
			hompageFB.clickOninbox();
			String urlinbox = driver.getCurrentUrl();
			String titleinbox=driver.getTitle();
			System.out.println(titleinbox);
			System.out.println(urlinbox);
			
			hompageFB.clickOnInboxCheck();
			
			
			
			//driver.close();
			//Thread.sleep(2000);
			//hompageFB.clickOnVehicles();
			
			
			

}
}