package com.selenium.dependencies;

import org.testng.annotations.Test;

public class TestGroupDependency 
{
    @Test(groups="Smoke")
	public void test1()
	{
		System.out.println("Smoke");
	}
    
    @Test(groups="Smoke")
   	public void test2()
   	{
   		System.out.println("Smoke");
   	}
    
    @Test(groups="Smoke")
   	public void test3()
   	{
   		System.out.println(5/0);
   	}
    
    @Test(groups="Sanity")
  	public void test4()
  	{
  		System.out.println("Sanity");
  	}
      
      @Test(groups="Sanity")
     	public void test5()
     	{
     		System.out.println("Sanity");
     	}
      
      @Test(groups="Regression")
     	public void test6()
     	{
     		System.out.println("Regression");
     	}
      
      @Test(groups="Regression")
   	public void test7()
   	{
   		System.out.println("Regression");
   	}
      
   /*@Test(dependsOnGroups= {"Smoke" , "Sanity"})
   	public void test0()
   	{
   		System.out.println("main test method");
   	} */
}
