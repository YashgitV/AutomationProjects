package com.Program.Practice;

public class Constructor {

	int a;
	public Constructor()
	{
		System.out.println("executing constructor");
		a=56;
	}
	
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		System.out.println("a="+c1.a);
		new Constructor();
		
		
	}


}