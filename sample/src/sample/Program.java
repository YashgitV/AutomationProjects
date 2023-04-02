package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
	 ChromeDriver cd= new ChromeDriver();
	 cd.get("http://127.0.0.1:81/login.do");
	 cd.findElement(By.name("username")).sendKeys("admin");
	 cd.findElement(By.name("pwd")).sendKeys("manager");
	 cd.findElement(By.xpath("//input[@type='submit']")).click();
	 Thread.sleep(1000);
	 cd.findElement(By.linkText("Projects & Customers")).click();
	 cd.findElement(By.cssSelector("input[value='Add New Customer']")).click();
	 Thread.sleep(1000);
	 cd.findElement(By.name("name")).sendKeys("yaswanth1");
	 cd.findElement(By.name("description")).sendKeys("xyz");
	 Thread.sleep(1000);
	 cd.findElement(By.name("createCustomerSubmit")).click();
	 cd.findElement(By.className("logoutImg")).click();
	}
}
