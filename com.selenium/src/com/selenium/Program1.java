package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\64bitAutomationSW\\chromedriver_win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://127.0.0.1:81/login.jsp");
		cd.findElement(By.name("username")).sendKeys("admin");
		cd.findElement(By.name("pwd")).sendKeys("manager");
		cd.findElement(By.xpath("//input[@type='submit']")).click();
	    String s1=cd.getTitle();
	    System.out.println(s1);
	cd.findElement(By.className("logoutImg")).click();
	int i=cd.getPageSource().length();
	System.out.println(i);

	}

}
