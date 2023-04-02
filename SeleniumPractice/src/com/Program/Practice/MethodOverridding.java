package com.Program.Practice;

class Hotel
{
	public void food()
	{
		System.out.println("get the food from near by hotels");
	}
}

class Restaurant extends Hotel
{
	public void food()
	{
		System.out.println("get the food from near by restaurant");
	}
}
public class MethodOverridding {

	public static void main(String[] args) {

		Restaurant r1 = new Restaurant();
		r1.food();
		Hotel h1 = new Hotel();
		h1.food();
		
	}

}
