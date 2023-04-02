package com.selenium.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreenshot {

	  static ChromeDriver driver;
	  
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Utils.CaptureScreenshot(driver, "Image4.jpg");
		driver.findElement(By.xpath("//*[@id=\'navbtn_exercises\']")).click();
		Utils.CaptureScreenshot(driver, "Image5.jpg");
	///	TakesScreenshot ts = (TakesScreenshot)driver; 
		//we have 3 types to get the screenshot
		//1
		/*File source = ts.getScreenshotAs(OutputType.FILE); 
		File target = new File("C:\\Screenshots\\Image.jpg");
		FileUtils.moveFile(source, target); */
		//2
		/*String byte64code = ts.getScreenshotAs(OutputType.BASE64); //it is string format that's why we convert to byte formate
		byte[] bytearr = Base64.getDecoder().decode(byte64code);
		FileOutputStream fos = new FileOutputStream("C:\\Screenshots\\Image1.jpg");
		fos.write(bytearr);
		fos.close(); */
	/*	byte[] bytearray = ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos = new FileOutputStream("C:\\Screenshots\\Image2.jpg");
		fos.write(bytearray);
		fos.close(); */
		driver.quit();

	}

}
