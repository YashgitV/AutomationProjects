package com.selenium.data.provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testdataprovider4 {
	
	 ChromeDriver driver;

	@Test(dataProvider="loginData" , dataProviderClass = ExcelDataSupplier.class)
	public void TestLogin(String Username,String Password) throws Exception
	{	
		 System.out.println("open the OrangeHRM app");
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

}
