package com.Program.Practice;

 class Test
 {
	public void bat()
	{
		System.out.println("he owns the cricket bat");
	}
	
}
  
   class single1 extends Test
  {
	 public void ball()
	 {
		 System.out.println("he owns the cricket ball");
	 }
}
   
   public class SingleInheritance 
   {
	public static void main(String[] args) {
		
		System.out.println("main method started");
		single1 se1 = new single1();
		se1.ball();
		se1.bat();

	}


}