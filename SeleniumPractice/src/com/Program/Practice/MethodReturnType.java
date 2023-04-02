package com.Program.Practice;

public class MethodReturnType {
	
	public static double Display(int a,char ch)
	{
		System.out.println("a="+a);
		System.out.println("b="+ch);
		return 8.5;
	}

	public static void main(String[] args) {

      System.out.println("execution started");
      double res = Display(10,'A');
      System.out.println("res="+res);
      System.out.println("execution ended");
	}

}
