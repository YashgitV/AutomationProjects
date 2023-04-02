package com.Program.Practice;

class Flipkart
{
	public void Product()
	{
		System.out.println("Flipkart:huge range of produts are available");
	}
}

class Person1 extends Flipkart
{
	public void purchasedthUpi()
	{
		System.out.println("selected one product and purchased through UPI");
	}
}

class Person2 extends Flipkart
{
	public void purchasethcards()
	{
		System.out.println("selected one product and purchased throuh Credit cards");
	}
}
public class Hierarchical {

	public static void main(String[] args) {

       Person2 p2 = new Person2();
       p2.Product();
       p2.purchasethcards();
       Person1 p1 = new Person1();
       p1.Product();
       p1.purchasedthUpi();

	}

}
