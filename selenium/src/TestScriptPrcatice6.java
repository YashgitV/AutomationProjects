import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 

public class TestScriptPrcatice6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver ref6=new ChromeDriver();
		ref6.get("http://127.0.0.1:81/login.do");
		ref6.findElement(By.name("username")).sendKeys("admin");
		 ref6.findElement(By.name("pwd")).sendKeys("manager");
		 ref6.findElement(By.xpath("//input[@type='submit']")).click();
		 ref6.findElement(By.linkText("Reports")).click();
		 ref6.findElement(By.xpath("//input[@value='false']")).click();
		 WebElement e1=ref6.findElement(By.name("users"));
		 Select s1=new Select(e1);
		 int n=s1.getOptions().size();
		 System.out.println(n);
		 for(int i=0;i<n;i++)
		 {
			 if(i%2==0)
			 {
				 s1.selectByIndex(i);
			 }
		 }
       Thread.sleep(1000);	
       s1.deselectAll();
      for(int i=0;i<n;i++)
      {
    	 s1.selectByIndex(i);
      }
      Thread.sleep(1000);
      for(int i=n-1;i>=0;i--)
      {
    	  s1.deselectByIndex(i);
      }
      Thread.sleep(1000);
      for(int i=0;i<n;i++)
      {
    	  if(i%2!=0)
    	  {
    		  s1.selectByIndex(i);
    		  
    	  }
      }
    	  Thread.sleep(1000);
    	  List<WebElement> t=s1.getOptions() ;
    	  for(int j=0;j<t.size();j++)
    	  {
    		  if(j%2!=0)
    		  {
    			  System.out.println(t.get(j).getText());
    		  }
    	  }
	}
	
}
