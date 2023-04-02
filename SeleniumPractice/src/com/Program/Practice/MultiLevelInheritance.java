package com.Program.Practice;

class Sample11
{
	public void dad()
	{
		System.out.println("Earns the money:he had a motor bike");
	}
}

class Sample2 extends Sample11
{
	public void mom()
	{
		System.out.println("took the money from dad and save the money:she has a ring");
	}
}

class Sample3 extends Sample2
{
	public void children()
	{
		System.out.println("spending his parents money as well as his savings for studies");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {

		
		Sample3 s3 = new Sample3();
		s3.dad();
		s3.mom();
		s3.children();
		

	}

}
