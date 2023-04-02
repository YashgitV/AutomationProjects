import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptPractice5 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe" );
		ChromeDriver ref2=new ChromeDriver();
		ref2.get("http://127.0.0.1:81/login.do");
		ref2.findElement(By.name("username")).sendKeys("admin");
		ref2.findElement(By.name("pwd")).sendKeys("manager");
		ref2.findElement(By.xpath("//input[@type='submit']")).click();
		ref2.findElement(By.linkText("Reports")).click();
        WebElement d1= ref2.findElement(By.name("users"));
       Select s2=new Select(d1);
        int x=s2.getOptions().size();
        System.out.println(s2);
       for(int i=0;i<x;i++)
        {
        	if(i%2==0)
        	{
        		s2.selectByIndex(i);
        	}
        }
        Thread.sleep(1000);
        s2.deselectAll();
        for(int i=0;i<x;i++)
        {
        	s2.selectByIndex(i);
        }
        Thread.sleep(1000);
        for(int i=x-1;i>=0;i--)
        {
        	s2.deselectByIndex(i);
        }
        Thread.sleep(1000);
        for(int i=0;i<x;i++)
        {
        	if(i%2!=0)
        	{
        		s2.selectByIndex(i);
        	}
        }
        Thread.sleep(1000);
        List <WebElement> r2=s2.getOptions();
        for(int i=0;i<x;i++)
        {
        	if(i%2!=0)
        	{
        		System.out.println(r2.get(i).getText());
        		
        	}
        }
         
		

	}

}
