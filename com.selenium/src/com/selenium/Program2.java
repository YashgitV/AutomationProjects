package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
	ChromeDriver ref=new ChromeDriver();
	ref.get("http://127.0.0.1:81/login.do");
	ref.findElement(By.name("username")).sendKeys("admin");
	ref.findElement(By.name("pwd")).sendKeys("manager");
	ref.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(1000);
	ref.findElement(By.className("logoutImg")).click();
		
	}
}