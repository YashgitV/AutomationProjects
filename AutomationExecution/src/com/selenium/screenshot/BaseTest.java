package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static ChromeDriver driver;
	public static String screenshotsSubFolderName;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void screenCapture(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		CaptureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");

		}
	}
    
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	public void CaptureScreenshot(String FileName) throws IOException
	{
		// File
		if(screenshotsSubFolderName==null)
		{
		  LocalDateTime myDateObj = LocalDateTime.now();
		  System.out.println("Before formatting: " + myDateObj);
		  DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

	      screenshotsSubFolderName = myDateObj.format(myFormatObj);
	      
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\SaveScreenshot\\"+ screenshotsSubFolderName+"/"+FileName);
		try 
		{
		FileUtils.copyFile(sourceFile, destFile);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		
		
	}
}
