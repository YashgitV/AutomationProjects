import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Government {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver v1=new ChromeDriver();
	  v1.get("http://goidirectory.nic.in/index.php");
	  v1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  v1.findElement(By.linkText("Prime Minister's Office")).click();
      Thread.sleep(10000);
      Set<String> m2=v1.getWindowHandles();
      for(String d2:m2)
      {
    	  v1.switchTo().window(d2);
    	  if(v1.getTitle().contains("Prime minister"))
    	  {
    		  System.out.println(v1.getCurrentUrl());
    		  System.out.println(v1.getTitle());
    		  break;
    	  }
    		  
      }
      
      
	}

}
