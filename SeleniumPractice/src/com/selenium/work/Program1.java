package com.selenium.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:/Drivers/Chromedriver.exe");
		 driver = new ChromeDriver();
		 Dimension d1 = new Dimension(500,300);
		driver.manage().window().setSize(d1);
		Thread.sleep(5000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.automationtestinginsider.com/");
		 Thread.sleep(4000);
		String s1 = driver.getCurrentUrl();
		System.out.println("current url is s1="+s1);
		String s2 = driver.getTitle();
		System.out.println("title of webpage is s2="+s2);
		//String s3= driver.getPageSource();
		//System.out.println("pagesource s3="+s3);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,800)", "");
		driver.findElement(By.linkText("DEMO WEBSITES")).click();
		Thread.sleep(4000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,1800)","");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Different Elements on a Web Page")).click();
		Thread.sleep(4000);
		
		/*	String wind1 = driver.getWindowHandle();//returns the ID's of single browser browsers
       	System.out.println("wind1="+wind1);
       	*/
    
	 Set<String> windowhand =  driver.getWindowHandles(); //returns the ID's of multiple browsers
      
	// first method - iterator()
	 /*  Iterator<String> it1 = windowhand.iterator();
        String parentwindowIDs = it1.next();
        String childwindowID = it1.next();
        
       System.out.println("parentwindowid is ="+parentwindowIDs);
        System.out.println("childwindowid is ="+childwindowID); */
        
        /* 	JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,3000)","");
		WebElement w1 = driver.findElement(By.xpath("//select[@name='cars']"));
		Select sl1 = new Select(w1);
		sl1.selectByVisibleText("Audi");
		Thread.sleep(3000);
		driver.close(); */
        
        //second method - using List\ArrayList
        
       List<String> wind2 = new ArrayList(windowhand);// convert set---> list
       
       /*  String parentwindowIDs1 = wind2.get(0);
        String childwindowID1 = wind2.get(1);
        
        System.out.println("parentwindowid is ="+parentwindowIDs1);
        System.out.println("childwindowid is ="+childwindowID1);
		
		//how to use window ID's for Switching purpose
        
        driver.switchTo().window(parentwindowIDs1);
        System.out.println("parentwindowtitle="+driver.getTitle());
        driver.switchTo().window(childwindowID1);
        System.out.println("childwindowtitle="+driver.getTitle());
        */
       // for each loop
       
       /*  for(String windowid1 : wind2)
        {
        	String Title = driver.switchTo().window(windowid1).getTitle();
           System.out.println(Title);
        }
        //dropdown
        
          JavascriptExecutor js31 = (JavascriptExecutor)driver;
		js31.executeScript("window.scrollBy(0,2500)", "");
		
		WebElement w1 = driver.findElement(By.xpath("//select[@name='cars']"));
		Select sl1 = new Select(w1);
		sl1.selectByVisibleText("Audi");
		Thread.sleep(2000);
		 */
        for(String windowid1 : wind2)
        {
       	String Title = driver.switchTo().window(windowid1).getTitle();
       	System.out.println(Title);
        if(Title.equals("Automation Testing Insider: DEMO WEBSITES"))
        {
        	driver.close();
        }
       }
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
