package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptPractice4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver ref5=new ChromeDriver();
		ref5.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ref5.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=542e8aa3a1e45a66f1be6f508b3b0e22");
		ref5.findElement(By.linkText("Home")).click();
		ref5.findElement(By.name("userName")).sendKeys("yaswanth kumar");
		ref5.findElement(By.name("password")).sendKeys("subha@430");
		Thread.sleep(1000);
		ref5.findElement(By.name("login")).click();
		ref5.findElement(By.cssSelector("input[value='oneway']")).click();
		WebElement a=ref5.findElement(By.name("passCount"));
		Select s =new Select(a);
		s.selectByValue("2");
	   WebElement b=ref5.findElement(By.name("fromPort"));
	   Select s1=new Select(b);
	   s1.selectByVisibleText("New York");
	   WebElement c=ref5.findElement(By.name("fromMonth"));
	   Select s2=new Select(c);
	   s2.selectByVisibleText("october");
	   WebElement d=ref5.findElement(By.name("fromDay"));
	   Select s3=new Select(d);
	   s3.selectByValue("11");
	   WebElement e=ref5.findElement(By.name("toPort"));
	   Select s4=new Select(e);
	   s4.selectByValue("London");
	   WebElement i=ref5.findElement(By.name("toMonth"));
	   Select s5=new Select(i);
	   s5.selectByVisibleText("october");
	   WebElement j=ref5.findElement(By.name("toDay"));
	   Select s6=new Select(j);
	   s6.selectByValue("15");
	   ref5.findElement(By.cssSelector("input[value='Coach']")).click();
	   WebElement k=ref5.findElement(By.name("airline"));
	   Select s7=new Select(k);
	   s7.selectByVisibleText("Blue Skies Airlines");
	   ref5.findElement(By.name("findFlights")).click();
	   
	   
	   
	   
	   
		
        
	}
}
   