package com.ninja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ninja {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver f5=new ChromeDriver();
		f5.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		f5.get("http://tutorialsninja.com/demo/");
		f5.manage().window().maximize();
		f5.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		f5.findElement(By.className("caret")).click();
		f5.findElement(By.linkText("Register")).click();
		f5.findElement(By.name("firstname")).sendKeys("yashhu");
		f5.findElement(By.name("lastname")).sendKeys("kumar");
		f5.findElement(By.name("email")).sendKeys("ghfgcvvvcx@gmail.com");
		f5.findElement(By.name("telephone")).sendKeys("7396749570");
		f5.findElement(By.name("password")).sendKeys("123456");
		f5.findElement(By.name("confirm")).sendKeys("123456");
		f5.findElement(By.name("agree")).click();
		f5.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement r1=f5.findElement(By.linkText("Desktops"));
		 Actions a1= new Actions(f5);
         a1.moveToElement(r1).perform();
		f5.findElement(By.linkText("Mac (1)")).click();
		f5.findElement(By.className("button-group")).click();
		f5.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
		f5.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/checkout\']")).click();
		f5.findElement(By.name("firstname")).sendKeys("yashhu");
		f5.findElement(By.name("lastname")).sendKeys("kumar");
		f5.findElement(By.name("address_1")).sendKeys("sr nagar");
		f5.findElement(By.name("city")).sendKeys("hyderabad");   
		f5.findElement(By.name("postcode")).sendKeys("500038");
WebElement v1=f5.findElement(By.name("zone_id"));
Select s1=new Select(v1);
s1.selectByVisibleText("Angus");
Thread.sleep(5000);
f5.findElement(By.id("button-payment-address")).click();
Thread.sleep(3000);



	}

}
