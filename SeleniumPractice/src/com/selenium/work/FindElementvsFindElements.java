package com.selenium.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementvsFindElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:/Drivers/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		
		//findelement ----> Returns the single webelement
		//single webelement
		
		WebElement web1 = driver.findElement(By.xpath("//input[@type='text']"));
		web1.sendKeys("Iphone");
		
		//Multiple Webelements
		WebElement el1 = driver.findElement(By.xpath("//div[@class='footer-upper']//a]"));
		System.out.println(el1.getText());
		
	}

}
