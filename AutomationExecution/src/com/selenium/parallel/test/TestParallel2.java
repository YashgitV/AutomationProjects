package com.selenium.parallel.test;

import org.testng.annotations.Test;

public class TestParallel2 {
	
	@Test
	public void testmethod5()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel2 << testmethod5 "+Thread.currentThread().getId()); 
	}

	@Test
	public void testmethod6()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel2 << testmethod6 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod7()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel2 << testmethod7 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod8()
	{
		System.out.println("TestParallel2 << testmethod8 "+Thread.currentThread().getId());
	}
}
