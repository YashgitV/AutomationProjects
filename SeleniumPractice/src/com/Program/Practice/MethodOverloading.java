package com.Program.Practice;

public class MethodOverloading {

	public static void deliveryitem()
	{
		System.out.println("");
	}
	public static void deliveryiem(String b ,int quantity)
	{
		System.out.println("b="+b);
		System.out.println("quantity="+quantity);
	
	}
	public static void deliveryiem(String snack,double price)
	{
		System.out.println("snack="+snack);
		System.out.println("price="+price);
	}
	public static void deliveryiem(String d,double price,int quantity)
	{
		System.out.println("d="+d);
		System.out.println("price="+price);
		System.out.println("quantity="+quantity);
	}
	public static void deliveryiem(String dr1)
	{
		System.out.println("dr1="+dr1);
		
	}
	public static void main(String[] args) {

		deliveryiem("burger",3);
		deliveryiem("bisuit",14.00);
		deliveryiem("cake",15.00,2);
		deliveryiem("biryani");
		


	}

}
