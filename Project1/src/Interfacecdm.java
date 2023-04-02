interface ATM 
{ 
public abstract void deposit(); 
public abstract void withdrawl(); 
} 
class Cust implements ATM 
{ 
@Override
public void deposit() { 
 System.out.println("Please deposit ur amount"); 
 } 
@Override
public void withdrawl() { 
 System.out.println("Collect ur amount"); 
 } 
} 

public class Interfacecdm {

	public static void main(String[] args) 
	{
		Cust c1 = new Cust();
		c1.deposit();
		c1.withdrawl();

	}

}
