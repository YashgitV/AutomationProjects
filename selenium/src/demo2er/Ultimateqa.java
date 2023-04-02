package demo2er;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ultimateqa {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
ChromeDriver m1=new ChromeDriver();
m1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
m1.get("https://ultimateqa.com");
m1.findElement(By.linkText("Automation Exercises")).click();
m1.findElement(By.linkText("Login automation")).click();
//m1.findElement(By.xpath(//)")).click();

	}

}
