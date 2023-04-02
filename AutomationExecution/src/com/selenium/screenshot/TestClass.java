package com.selenium.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends BaseTest {
	
		@Test(testName ="TestGoogle")
		public void TestGoogle() throws InterruptedException
		{
			System.out.println("open the google");
			
			//WebDriverManager.ChromeDriver().Setup();
			driver.get("https://www.google.com/");
			WebElement ele= driver.findElement(By.name("q"));
			ele.sendKeys("suresh sdet automation", Keys.ENTER);
			String expectedTitle = "suresh sdet automation - Google Search";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle,"Title is mismatched");
			Assert.assertTrue(true);
			
			
	}   
		@Test(testName ="TestFacebook")
		public void TestFacebook() throws InterruptedException
		{
			System.out.println("open the facebook");
			driver.get("https://www.facebook.com/");
			WebElement ele1 = driver.findElement(By.name("email"));
			ele1.sendKeys("yaswanth@430" ,Keys.ENTER);
			
			SoftAssert softassert = new SoftAssert();
			
			//Title Assertion
			String expectedTitle="Facebook � log in or sign up";
			String actualTitle=driver.getTitle();
			softassert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
			
			//URL Assertion
			  String expectedUrl="https://www.facebook.com/";
			  String actualUrl=driver.getCurrentUrl();
			  softassert.assertNotEquals(actualUrl, expectedUrl, "Url is mismatched");
			  
			 //Text Assertion
			  String expectedText="";
			  String actualText= driver.findElement(By.name("email")).getAttribute("value");
			  softassert.assertEquals(actualText, expectedText, "Text is mismatched");
			  
			  //Border Assertion
			  String expectedBorder="1px solid rgb(240, 40, 73)";
			  String actualBorder= driver.findElement(By.name("email")).getCssValue("border");
			  softassert.assertEquals(actualBorder, expectedBorder, "username Border is mismatched");
			  
			  //Error Message
			  String expectederrmessage="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
			  String actualerrmessage= driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
			  softassert.assertEquals(actualerrmessage, expectederrmessage, "username error message is mismatched");
			 	  
			 
			  softassert.assertAll();
		}
		
		@Test(testName ="TestOranageHRM")
		public void TestOranageHRM()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin234");
			driver.findElement(By.id("btnLogin")).click();
			Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		}  

	}



