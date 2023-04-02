package com.selenium.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAttributes1 
{	
	ChromeDriver driver;
	
	///@Test(invocationCount = 3 , invocationTimeOut = 10000)
	@Test(invocationCount = 4 , threadPoolSize = 2)
	public void testmethod1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("Username:  " + driver.findElement(By.id("user-value")));
		//driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]")).click();
		
		
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		System.out.println("Emailaddress: " + driver.findElement(By.id("user-value")));
		driver.quit();
	}
	
}
