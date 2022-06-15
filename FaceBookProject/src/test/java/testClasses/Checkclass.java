package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Checkclass {
		SoftAssert soft;
		WebDriver driver;
		@BeforeClass
		public void beforeclas()
		{
			System.out.println("BeforeClaSS");
			  
			
			
		}
		@BeforeMethod
		public void beforemethod()
		{
			System.out.println("BeforeMethod");
			soft=new SoftAssert();// this will call every time before each test case
		}
		@Test
		public void testclassA()
		{
			
			System.out.println("TestClaSS-A");
			soft.assertEquals("Bye", "Bye");
			soft.assertEquals("Hello", "Hello");
			soft.assertEquals("Hi", "Hi");
			soft.assertEquals("Hello", "Hello");
			soft.assertAll();
		}

		@Test
		public void testclassB()
		{
			System.out.println("TestClaSS-B");
			soft.assertEquals("Hi", "Hi");
			soft.assertEquals("Hi", "Hi");
			soft.assertEquals("Hi", "Hi");
			soft.assertEquals("Hello", "Hello");
			soft.assertAll();
		}
		
		@AfterMethod
		public void afteremethod()
		{
			System.out.println("AfterMethod");
			
		}
		@AfterClass
		public void aftermethod()
		{
			System.out.println("AfterClaSS");
		}
	}


