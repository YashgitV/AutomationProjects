package com.selenium.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest {
	
	@Test
	public void TestGoogle() throws InterruptedException
	{
		System.out.println("open the google");
		
		//WebDriverManager.ChromeDriver().Setup();
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele= driver.findElement(By.name("q"));
		ele.sendKeys("suresh sdet automation", Keys.ENTER);
		String expectedTitle = "suresh sdet automation - Google Search";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Title is mismatched");
		Assert.assertTrue(true);
		Thread.sleep(5000);
		driver.close();	
	}   
	@Test
	public void TestFacebook() throws InterruptedException
	{
		System.out.println("open the facebook");
	    System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		ChromeDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		WebElement ele1 = driver1.findElement(By.name("email"));
		ele1.sendKeys("yaswanth@430" ,Keys.ENTER);
		
		SoftAssert softassert = new SoftAssert();
		
		//Title Assertion
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver1.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		//URL Assertion
		  String expectedUrl="https://www.facebook.com/";
		  String actualUrl=driver1.getCurrentUrl();
		  softassert.assertNotEquals(actualUrl, expectedUrl, "Url is mismatched");
		  
		 //Text Assertion
		  String expectedText="";
		  String actualText= driver1.findElement(By.name("email")).getAttribute("value");
		  softassert.assertEquals(actualText, expectedText, "Text is mismatched");
		  
		  //Border Assertion
		  String expectedBorder="1px solid rgb(240, 40, 73)";
		  String actualBorder= driver1.findElement(By.name("email")).getCssValue("border");
		  softassert.assertEquals(actualBorder, expectedBorder, "username Border is mismatched");
		  
		  //Error Message
		  String expectederrmessage="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		  String actualerrmessage= driver1.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		  softassert.assertEquals(actualerrmessage, expectederrmessage, "username error message is mismatched");
		 	  
		  driver1.quit();
		  softassert.assertAll();
	}

}
