package com.Program.Practice;

public class NoArgConstructor {
	
	String name;
	int Emp_Id;

	 NoArgConstructor()
	{ 
		 name="yaswanth";
		 Emp_Id=733;
	}
	public static void main(String[] args) {
		 
		NoArgConstructor a1 = new NoArgConstructor();
		System.out.println("name="+a1.name);
		System.out.println("Emp_Id="+a1.Emp_Id);
		NoArgConstructor a2 = new NoArgConstructor();
		System.out.println("name="+a2.name);
		System.out.println("Emp_Id="+a2.Emp_Id);
		
	}

}
