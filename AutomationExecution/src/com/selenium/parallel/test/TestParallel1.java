package com.selenium.parallel.test;

import org.testng.annotations.Test;

public class TestParallel1 {
	
	@Test
	public void testmethod1()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel1 << testmethod1 "+Thread.currentThread().getId()); 
	}

	@Test
	public void testmethod2()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel1 << testmethod2 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod3()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel1 << testmethod3 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod4()
	{
		System.out.println("TestParallel1 << testmethod4 "+Thread.currentThread().getId());
	}
}
