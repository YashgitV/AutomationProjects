import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptPractice9 {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver ref4=new ChromeDriver();
		ref4.get("http://127.0.0.1:81/login.do");
		ref4.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ref4.findElement(By.name("username")).sendKeys("admin");
		ref4.findElement(By.name("pwd")).sendKeys("manager");
		ref4.findElement(By.xpath("//input[@type='submit']")).click();
        ref4.findElement(By.linkText("Settings")).click();
        ref4.findElement(By.xpath("//input[@value='Add New Billing Type']")).click();
        String s="yaswanth02";
        ref4.findElement(By.name("name0")).sendKeys(s);
        ref4.findElement(By.xpath("//input[@value='Create Billing Type(s)']")).click();
        System.out.println(ref4.findElement(By.className("successmsg")).getText());
        ref4.findElement(By.linkText("Projects & Tasks")).click();
        ref4.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
       WebElement s2= ref4.findElement(By.name("task[0].billingType"));   
    		   Select s5=new Select(s2);
    		   int count=0;
    		   
     List<WebElement> w1=s5.getOptions();
     Iterator<WebElement> w2=w1.iterator();
           while(w2.hasNext())
           {
        	   String s1=w2.next().getText();
        	   
           if(s1.equals(s))
{
         count++;	
}
           }  
if(count==1)
{
	System.out.println("integartion testing is pass");
}
else
{
	System.out.println("integartion testing is failed");
}
}
}
