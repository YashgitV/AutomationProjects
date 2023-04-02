package com.Program.Practice;

public class AccessStaticDifferentClass {
	
	static String name="Kholi";
	static int centuries = 46;
	static double Avg= 57.75;
	
	public static void king()
	{
		System.out.println("Run machine");
	}
}

    class Cricket
   {
	public static void main(String[] args) {
		
		
		System.out.println("name="+AccessStaticDifferentClass.name);
		System.out.println("centuries="+AccessStaticDifferentClass.centuries);
		System.out.println("Avg="+AccessStaticDifferentClass.Avg);
		AccessStaticDifferentClass.king();
		

	}
   }
   

