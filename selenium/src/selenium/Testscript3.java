package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
	ChromeDriver cd1=new ChromeDriver();
	cd1.get("http://127.0.0.1:81/login.do");
	cd1.findElement(By.name("username")).sendKeys("admin");
	cd1.findElement(By.name("pwd")).sendKeys("manager");
	cd1.findElement(By.xpath("//input[@type='submit']")).click();
	cd1.findElement(By.linkText("Users")).click();
	cd1.findElement(By.cssSelector("input[value='Add New User']")).click();
	cd1.findElement(By.name("username")).sendKeys("rash");
	cd1.findElement(By.name("passwordText")).sendKeys("yaswanth");
	cd1.findElement(By.name("passwordTextRetype")).sendKeys("yaswanth");
	cd1.findElement(By.name("firstName")).sendKeys("yaswanth");
	cd1.findElement(By.name("lastName")).sendKeys("gollapothu");
	cd1.findElement(By.name("middleName")).sendKeys("yash");
	cd1.findElement(By.name("email")).sendKeys("yaswanth0430@gmail.com");
	cd1.findElement(By.cssSelector("input[value='   Create User   ']")).click();
	cd1.findElement(By.className("logoutImg")).click();
	cd1.findElement(By.name("username")).sendKeys("rash");
	cd1.findElement(By.name("pwd")).sendKeys("yaswanth");
	cd1.findElement(By.xpath("//input[@type='submit']")).click();
	cd1.findElement(By.name("passwordCur")).sendKeys("yaswanth");
	cd1.findElement(By.name("passwordNew")).sendKeys("kumar");
	cd1.findElement(By.name("passwordRetype")).sendKeys("kumar");
	Thread.sleep(10000);
	cd1.findElement(By.cssSelector("input[value='Save Changes']")).click();
	cd1.findElement(By.className("logoutImg")).click();
	cd1.close();
	}
	

}