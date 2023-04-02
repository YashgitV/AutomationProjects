package com.Program.Practice;



public class StringProgram {

	public static void main(String[] args) {

       String st1 = "Kairos Technologies";
         
       for(int i=0;i<st1.length();i++)
       {
    	   char ch = st1.charAt(i);
    	   // System.out.println(ch);
    	  if(ch!=' ')
    	   {
    		   System.out.print(ch);
    	   }
    	   else
    	   {
    		   System.out.println();
    	   }
       }

	}

}
