package com.selenium.Tests;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAttributes 
{
	 ChromeDriver driver;
	///timeout..it is used to verify the method is executed with in a specified time
	//@Test(timeOut = 15000) 
	@Test(expectedExceptions = {NoSuchElementException.class})
	public void testmethod1()
	{
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		driver.findElement(By.id("javastring")).click();
		driver.quit();
		
	}
}
