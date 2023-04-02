package com.Program.Practice;

public class Parconstructor {
	
	String format;
	int runs;
	
	Parconstructor(String cformat,int cruns)
	{
		format= cformat;
		runs = cruns;
		
		
	}
	

	public static void main(String[] args) {

		Parconstructor p1 = new Parconstructor("Test",8000);
		System.out.println("format="+p1.format);
		System.out.println("runs="+p1.runs);
		Parconstructor p2 = new Parconstructor("ODI",12875);
		System.out.println("format="+p2.format);
		System.out.println("runs="+p2.runs);
		

	}

}
