package com.selenium.prctice.listeners;

public interface IListners {
	
	static void  duringTest()
	{
		
	}
	
	 static void  beforeTest()
	 {
		 
	 }
	
	 static void afterTest()
	 {
		 
	 }
	
  default void  generateTest() //if we mention default or static keyword it will act as a normal method
 {
		 
	 }

}
