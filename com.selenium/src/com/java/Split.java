package com.java;

public class Split {

	public static void main(String[] args)
	{
		String s1="Every dog has one day";
		String [] s=s1.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}

	}

}
