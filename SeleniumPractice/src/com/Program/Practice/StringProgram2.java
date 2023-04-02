package com.Program.Practice;

import java.util.Scanner;

public class StringProgram2 {

	public static void main(String[] args) {

		/*  Scanner sc = new Scanner(System.in);
         System.out.println("enter a string");
         
         String s =sc.next();
         for(int i=0;i<s.length();i++)
         {
        	 char ch = s.charAt(i);
        	 System.out.println(ch);
         }
         
         */
		
		String str = "KairosTechnologies";
		
		//int lenghtofthestring = str.length();
		
		//System.out.println(lenghtofthestring);
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			System.out.println(ch);
		}

	}

}
