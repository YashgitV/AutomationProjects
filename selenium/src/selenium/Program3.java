package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
	 ChromeDriver ref1= new ChromeDriver();
	 ref1.get("http://127.0.0.1:81/login.do");
	 ref1.findElement(By.name("username")).sendKeys("admin");
	 ref1.findElement(By.name("pwd")).sendKeys("manager");
	 ref1.findElement(By.xpath("//input[@type='submit']")).click();
	 Thread.sleep(1000);
	 ref1.findElement(By.linkText("Projects & Customers")).click();
	 ref1.findElement(By.cssSelector("input[value='Add New Customer']")).click();
	 Thread.sleep(1000);
	 ref1.findElement(By.name("name")).sendKeys("kumar");
	 ref1.findElement(By.name("description")).sendKeys("Never give up");
	 Thread.sleep(10000);
	 ref1.findElement(By.name("createCustomerSubmit")).click();
	 ref1.findElement(By.className("logoutImg")).click();

	}

}