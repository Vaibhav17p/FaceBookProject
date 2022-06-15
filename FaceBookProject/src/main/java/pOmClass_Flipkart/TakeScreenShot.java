package pOmClass_Flipkart;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class TakeScreenShot {
	
	
	public TakeScreenShot(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void takeScreenshot(WebDriver driver) throws InterruptedException, IOException
    {
		
    	TakesScreenshot t=(TakesScreenshot)driver;
	    File source =t.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\ADMIN\\Desktop\\Vaibs\\SS\\name.jpg"+"Screenshot1");
	    Thread.sleep(3000);
	    FileHandler.copy(source, dest);
    }

}
