package com.Program.Practice;

public class LoginPage {
	
	public static boolean login(String username,String password)
	{
		if(username=="yaswanth" && password=="yash_430")
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {

    System.out.println("execution started");
    boolean res=login("yaswanth","yash_430");
    if(res==true)
    {
    	System.out.println("home page displayed");
    }
    else
    {
    	System.out.println("Invalid username or password");
    }
     System.out.println("execution ended");
	}

}
