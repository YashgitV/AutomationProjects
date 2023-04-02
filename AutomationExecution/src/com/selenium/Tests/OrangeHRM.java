package com.selenium.Tests;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;



public class OrangeHRM {
	
	 ChromeDriver driver;
	 EdgeDriver driver1;
	 FirefoxDriver driver2;
     @Parameters("browserName")  
	 @BeforeTest
	 public void InitialiseBrowser(@Optional("chrome")String browserName)
	 {
    	 switch(browserName.toLowerCase())
    	 {
         case "chrome" :
        	 System.out.println("open the OrangeHRM app");
    		 System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
    		//WebDriverManager.ChromeDriver().Setup();
			 driver = new ChromeDriver();
			 break;
         case "edge" :
        	 System.setProperty("webdriver.edge.driver","C://Drivers//edgedriver.exe");
        	 driver1 = new EdgeDriver();
        	 break;
         case "firefox" :
        	 System.setProperty("webdriver.firefox.driver","C://Drivers//firefoxdriver.exe");
        	 driver2 = new FirefoxDriver();
        	 break;
 
           default:
        	   System.err.println("Browsername is invalid");
        	   break;
    	 }
			driver.manage().window().maximize();
	 }
	
     @Parameters("sleepTime")    
	@AfterTest
	 public void TearDown(Long sleepTime) throws InterruptedException
	 {
       System.out.println(sleepTime);
      /// Thread.sleep(Long.valueOf(sleepTime)); /// if we mention string as parameter then we have to convert the long value to string
       Thread.sleep(sleepTime);
		 driver.quit();
		 
	 }
	@Parameters("url")
	@Test
	public void LaunchApp(String url)
	{
		driver.get(url);
	}
	
	@Parameters({"username","password"})
	@Test
	public void EnterLoginDetails(String username,String password) throws InterruptedException
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void NavigateToMyInfo()
	{
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	
	}
	
	@Test
	public void VerifyMyInfo()
	{
		 driver.findElement(By.id("employee-details")).isDisplayed();
	
	
		
	}
	
	@Test
	public void VerifyLogin() 
	{
		WebElement ele1 = driver.findElement(By.id("welcome"));
		Assert.assertTrue(ele1.isDisplayed());
		Assert.assertTrue(ele1.getText().startsWith("welcome"));
	
	
		}
	
}
