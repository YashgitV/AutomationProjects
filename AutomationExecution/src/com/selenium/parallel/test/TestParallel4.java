package com.selenium.parallel.test;

import org.testng.annotations.Test;

public class TestParallel4 {
	
	@Test
	public void testmethod13()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel4 << testmethod13 "+Thread.currentThread().getId()); 
	}

	@Test
	public void testmethod14()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel4 << testmethod14 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod15()
	{
		//if we want to get the id of the thread we Thread.currentThread().getId()
		System.out.println("TestParallel4 << testmethod15 "+Thread.currentThread().getId()); 
	}
	
	@Test
	public void testmethod16()
	{
		System.out.println("TestParallel4 << testmethod16 "+Thread.currentThread().getId());
	}
}
