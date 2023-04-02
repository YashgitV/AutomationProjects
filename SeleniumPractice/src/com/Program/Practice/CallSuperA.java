package com.Program.Practice;

class A
{
	public A(int i)
	{
		System.out.println("a constructor is executed");
	}
}
class B extends A
{
	public  B()
	{
		super(100);
		System.out.println("b constructor is executed");
		}
}
public class CallSuperA {

	public static void main(String[] args) {

     B b1 = new B();
   
     

	}

}
