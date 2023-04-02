package demo4;

import org.testng.annotations.Test;

public class MainScript extends Baseclass
{
@Test
public void mainscript()
{
	Opentaskpage v1=new Opentaskpage();
	v1.clickonProjectsCustomer();
	ActiveProjectsandcustomers b1=new ActiveProjectsandcustomers();
	b1.clickonaddNewCustomer();
	String s =b1.retrivesuccessmessage();
	System.out.println(s);
	Addnewcustomerpage n1=new Addnewcustomerpage();
	n1.entercustomername("yaswanth4");
	n1.clickoncreatecustomerbutton();
	
	
	
}
	
	
	
	
}
