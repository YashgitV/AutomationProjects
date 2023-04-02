package com.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException
	{

    System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
    ChromeDriver b1=new ChromeDriver();
    b1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    b1.get("https://www.facebook.com");
    b1.findElement(By.id("email")).sendKeys("7396749570");
    b1.findElement(By.id("pass")).sendKeys("subhashini430");
    b1.findElement(By.xpath("//input[@type='submit']")).click();
   // b1.findElement(By.linkText("Hyderabad Walkins")).click();
    Thread.sleep(4000);
   // System.out.println(b1.switchTo().alert().getText());
    b1.switchTo().alert().dismiss();   
	}

}
