package com.selenium.data.provider;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	@DataProvider()
	public String[] dp1()
	{
		String[] data = new String[]{"java","selenium","c#","c++"};
			
		return data;
}
  
	@DataProvider()
	public String[] dp2() 
	{
		String[] data = new String[]{"jmeter","appium","load runner","jira"};
			
		return data;
}
}
