package com.selenium.group.Test;

import org.testng.annotations.Test;

public class TestGroup2 {
	
	@Test(groups= {"regression"})
	public void test5() 
	  {
		  System.out.println("test5");
	  }
	  
	  @Test(groups= {"regression","smoke","windows.smoke"})
	  public void test6() 
	  {
		  System.out.println("test6");
	  }
	  
	  @Test(groups= {"functional","smoke","ios.functional"})
	  public void test7() 
	  {
		  System.out.println("test7");
	  }
	  
	  @Test(groups= {"smoke","windows.smoke"})
	  public void test8() 
	  {
		  System.out.println("test8");
	  }
	}


