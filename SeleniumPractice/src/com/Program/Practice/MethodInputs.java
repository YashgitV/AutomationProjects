package com.Program.Practice;

public class MethodInputs {

	public static void Empdetails(String name,long number,String mailid)
	{
		System.out.println("Name="+name);
		System.out.println("Number="+number);
		System.out.println("Email_Id="+mailid);
	}
	public static void main(String[] args) {

     System.out.println("Exeution started");
     Empdetails("yaswanth",7396749570l,"yash430@gmail.com");
     System.out.println("Execution ended");
     Empdetails("kumar",657726637l,"kyaa@gmail.com");
	}

}
