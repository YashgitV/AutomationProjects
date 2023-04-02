package com.selenium.Listeners;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;


public class TestParallel1 {

	@Test
	public void testmethod1()
	{
		
		System.out.println("i'm inside test method1"); 
	}

	@Test
	public void testmethod2()
	{
		
		System.out.println("i'm inside test method2"); 
		Assert.assertTrue(false);
	}
	
	@Test(timeOut=1000)
	public void testmethod3() throws Exception
	{
		Thread.sleep(3000);
		System.out.println("i'm inside test method3"); 
	}
	
	@Test(dependsOnMethods="testmethod3")
	public void testmethod4()
	{
		System.out.println("i'm inside test method4");
	}
}
