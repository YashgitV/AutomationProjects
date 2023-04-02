package com.Program.Practice;

public class AccessNonStaticSameClass {
	
	String profession ="Cricket";
	String role ="Wicket-keeper";
	String name="MS Dhoni";
	
	public void achievements()
	{
		System.out.println("won all 3  ICC world cups for india");
	}

	public static void main(String[] args) {

		AccessNonStaticSameClass ans1 = new AccessNonStaticSameClass();
		System.out.println("profession="+ans1.profession);
		System.out.println("role="+ans1.role);
		System.out.println("name="+ans1.name);
		ans1.achievements();

	}

}
