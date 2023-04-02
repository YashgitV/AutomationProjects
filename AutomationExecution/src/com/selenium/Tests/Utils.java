package com.selenium.Tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	public static void CaptureScreenshot(WebDriver driver,String FileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File source = ts.getScreenshotAs(OutputType.FILE); 
		File target = new File("C:\\Screenshots\\"+FileName+"");
		FileUtils.moveFile(source, target); 
	}

}
