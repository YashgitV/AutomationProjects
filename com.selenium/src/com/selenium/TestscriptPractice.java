package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestscriptPractice {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
    ChromeDriver ref1=new ChromeDriver();
    ref1.get("http://127.0.0.1:81/login.do");
    ref1.findElement(By.name("username")).sendKeys("admin");
    ref1.findElement(By.name("pwd")).sendKeys("manager");
    ref1.findElement(By.xpath("//input[@type='submit']")).click();
    ref1.findElement(By.linkText("Users")).click();
    ref1.findElement(By.cssSelector("input[value='Add New User']")).click();
    ref1.findElement(By.name("username")).sendKeys("ash");
    ref1.findElement(By.name("passwordText")).sendKeys("yaswanth");
    ref1.findElement(By.name("passwordTextRetype")).sendKeys("yaswanth");
    ref1.findElement(By.name("firstName")).sendKeys("yaswanth");
    ref1.findElement(By.name("lastName")).sendKeys("gollapothu");
    ref1.findElement(By.name("middleName")).sendKeys("yash");
    ref1.findElement(By.name("email")).sendKeys("yaswanth0430@gmail.com");
    ref1.findElement(By.name("phone")).sendKeys("7396749570");
    ref1.findElement(By.cssSelector("input[value='   Create User   ']")).click();
    ref1.findElement(By.className("logoutImg")).click();
    ref1.findElement(By.name("username")).sendKeys("ash");
    ref1.findElement(By.name("pwd")).sendKeys("yaswanth");
    ref1.findElement(By.xpath("//input[@type='submit']")).click();
    ref1.findElement(By.name("passwordCur")).sendKeys("yaswanth");
    ref1.findElement(By.name("passwordNew")).sendKeys("subha");
    ref1.findElement(By.name("passwordRetype")).sendKeys("subha");
    Thread.sleep(10000);
    ref1.findElement(By.cssSelector("input[value='Save Changes']")).click();
    ref1.findElement(By.className("logoutImg")).click();
    ref1.close();
    
	}

}
