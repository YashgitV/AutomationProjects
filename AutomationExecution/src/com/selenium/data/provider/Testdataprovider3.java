package com.selenium.data.provider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testdataprovider3 {
	
	@Test(dataProvider="dp2",dataProviderClass=DataSupplier.class)
	public void TestLogin(String s) throws Exception
	{	
		System.out.println(s);
		
	}  
	
/*	@DataProvider(indices= {0,2})
	public String[] dp1() ////it can be pass the data partially to the test methods
	{
		String[] data = new String[]{"java","selenium","c#","c++"};
			
		return data;
} */
	
}
