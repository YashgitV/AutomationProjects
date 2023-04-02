package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BankPara {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver m1=new ChromeDriver();
	  m1.get("https://parabank.parasoft.com/parabank/index.htm");
	  m1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	/*  m1.findElement(By.linkText("Register")).click();
	  m1.findElement(By.name("customer.firstName")).sendKeys("yaswanth");
	  m1.findElement(By.name("customer.lastName")).sendKeys("kumar");
	  m1.findElement(By.name("customer.address.street")).sendKeys("sr Nagar");
	  m1.findElement(By.name("customer.address.city")).sendKeys("Hyderabad");
	  m1.findElement(By.name("customer.address.state")).sendKeys("Telangana");
	  m1.findElement(By.name("customer.address.zipCode")).sendKeys("Ca1234");
	  m1.findElement(By.name("customer.phoneNumber")).sendKeys("7396749570");
	  m1.findElement(By.name("customer.ssn")).sendKeys("728853241837");
      m1.findElement(By.name("customer.username")).sendKeys("yaswanth21");
      m1.findElement(By.name("customer.password")).sendKeys("123456789");
      m1.findElement(By.name("repeatedPassword")).sendKeys("123456789");
      m1.findElement(By.xpath("//input[@value='Register']")).click();
      String s1=m1.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']".getText();
      System.out.println(s1);*/
	  m1.findElement(By.name("username")).sendKeys("yaswanth12");
	  m1.findElement(By.name("password")).sendKeys("123456789");
	  m1.findElement(By.xpath("//input[@type='submit']")).click();
     m1.findElement(By.linkText("Open New Account")).click();
     WebElement b1= m1.findElement(By.id("type"));
      Select s1=new Select(b1);
      s1.selectByVisibleText("SAVINGS");
     /* WebElement e1= m1.findElement(By.id("fromAccountId"));
      Select s=new Select(b1);
      s1.selectByVisibleText("32658");*/
      m1.findElement(By.xpath("//input[@value='Open New Account']")).click();
  //   String s2=m1.findElement(By.xpath("//[text()=)    
      
      
      
      
      
      
      
      
      
      
      
       
	}
  
}
