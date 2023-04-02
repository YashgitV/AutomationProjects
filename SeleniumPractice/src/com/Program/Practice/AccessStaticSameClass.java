package com.Program.Practice;

public class AccessStaticSameClass {
	
	static String carname = "BMW";
	static double price = 2000000.00 ;
	static String color = "Blue";
	
	public static void design()
	{
		System.out.println("good design and stylish look");
	}

	public static void main(String[] args) {
		
		System.out.println("carname="+carname);
		System.out.println("price="+price);
		System.out.println("color="+color);
		design();
		

	}

}
