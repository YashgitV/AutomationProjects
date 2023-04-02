package com.selenium.parallel.test;

import org.testng.annotations.Test;

public class TestParallel3 {
	
	@Test
	public void testmethod9()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel3 << testmethod9 "+Thread.currentThread().getId()); 
	}

	@Test
	public void testmethod10()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel3 << testmethod10 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod11()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel3 << testmethod11 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod12()
	{
		System.out.println("TestParallel3 << testmethod12 "+Thread.currentThread().getId());
	}
}
