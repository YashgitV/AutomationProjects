package demo4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass 
{
public static WebDriver rv1;
@BeforeTest	
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
	 rv1=new ChromeDriver();
	rv1.get("http://yaswanth:81/login.do;jsessionid=4o9dh9k50qah1");
	
}	
@BeforeClass
 public void login()
 {
	 rv1.findElement(By.name("username")).sendKeys("admin");
	 rv1.findElement(By.name("pwd")).sendKeys("manager");
	 rv1.findElement(By.xpath("//input[@type='submit']")).click();  
 }

@AfterClass
public void logout()
{
	rv1.findElement(By.className("logoutImg")).click();
}
@AfterTest
public void closebrowser()
{
	rv1.close();
}




 }


