package com.selenium.data.provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testdataprovider {
	
	 
	ChromeDriver driver;

	@Test(dataProvider="logintest")
	public void TestLogin(String Username,String Password) throws Exception
	{	
		// System.out.println("open the OrangeHRM app");
		 System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");	
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.findElement(By.id("txtUsername")).sendKeys(Username);
			driver.findElement(By.id("txtPassword")).sendKeys(Password);
			driver.findElement(By.id("btnLogin")).click();			
			Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
			Thread.sleep(2000);
			driver.quit();
	}
	
	@DataProvider(parallel = true)
	public Object[][] logintest()
	{
		Object[][] data = new Object[6][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin";
		data[1][1] = "test123";
		
		data[2][0] = "Test";
		data[2][1] = "admin123";
		
		data[3][0] = "test";
		data[3][1] = "test123";
		
     	data[4][0] = "java";
		data[4][1] = "testv123";
		
		data[5][0] = "script";
		data[5][1] = "testv123"; 
		
		return data;
		
		
	}

}
