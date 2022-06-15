package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static File captureScreenShot(WebDriver driver,int a) throws IOException
	{
		
		TakesScreenshot t=(TakesScreenshot)driver;
	    File source =t.getScreenshotAs(OutputType.FILE);
	    File dest = new File("test-output//SnapShot//FailedTC"+a+"jpg");
	   // Thread.sleep(3000);
	    FileHandler.copy(source, dest);
		return dest;
		
	}

}
