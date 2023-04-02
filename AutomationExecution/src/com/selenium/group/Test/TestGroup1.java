package com.selenium.group.Test;

import org.testng.annotations.Test;

//@Test(groups= {"all"})
public class TestGroup1 {
	
	@Test(groups= {"sanity"})
	public void test1() 
	  {
		  System.out.println("test1");
	  }
	  
	  @Test(groups= {"smoke","functional","windows.smoke"})
	  public void test2() 
	  {
		  System.out.println("test2");
	  }
	  
	  @Test(groups= {"regression","sanity","ios.regression","windows.sanity"})
	  public void test3() 
	  {
		  System.out.println("test3");
	  }
	  
	  @Test(groups= {"functional","windows.functional"})
	  public void test4() 
	  {
		  System.out.println("test4");
	  }
	}


