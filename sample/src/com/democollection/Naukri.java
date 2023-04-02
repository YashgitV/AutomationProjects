package com.democollection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		ChromeDriver h1=new ChromeDriver();
		h1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		h1.get("https://www.naukri.com");
		h1.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		h1.findElement(By.name("email")).sendKeys("yaswanth0430@gmail.com");
		h1.findElement(By.name("PASSWORD")).sendKeys("7396749570"+Keys.ENTER);
		//h1.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		

	}

}
