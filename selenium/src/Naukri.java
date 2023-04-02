import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver k1=new ChromeDriver();
	  k1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 k1.get("http://127.0.0.1:81/login.do");
		 k1.findElement(By.name("username")).sendKeys("admin");
		 k1.findElement(By.name("pwd")).sendKeys("manager");
		 k1.findElement(By.xpath("//input[@type='submit']")).click();
         k1.findElement(By.partialLinkText("Reports")).click();
         String currentwindow=k1.getWindowHandle();
         k1.findElement(By.xpath("//img[@src='/img/default/calendar/cal.gif']")).click();
         Set<String> t1=k1.getWindowHandles();
         for(String s1:t1)
         {
        	 if(!currentwindow.equals(t1))
        	 {
        		 k1.switchTo().window(s1);
        		 break;
        	 }
        	 
         }
        k1.findElement(By.xpath("//span[text()='23']")).click();
         k1.switchTo().window(currentwindow);
         
		

	}

}
