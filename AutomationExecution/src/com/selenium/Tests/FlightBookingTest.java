package com.selenium.Tests;

import org.testng.annotations.Test;

public class FlightBookingTest
{

	@Test(priority=1)
	public void Signup()
	{
		System.out.println("Signup");
	}
	
	@Test(priority=2)
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=3)
	public void SearchForTheflight()
	{
		System.out.println("SearchForTheflight");
	}
	
	@Test(priority=4)
	public void BookTheFlight()
	{
		System.out.println("BookTheFlight");
	}
	
	@Test(priority=5)
	public void SaveTheFlight()
	{
		System.out.println("SaveTheFlight");
	}
	
	@Test(priority=6)
	public void Logout()
	{
		System.out.println("Logout");
	}
	
}
