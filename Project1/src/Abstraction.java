 abstract class Paymentsapp
 {
	 String n;
	 Paymentsapp(String n)
	 {
		 System.out.println("type of Payment app is="+n);
		 this.n=n;
	 }
	   abstract void loanpayment();
	   abstract void mobilerecharge();
	   abstract void electricitybill();
 }
  class Account extends Paymentsapp
  {
	  String n;
	  Account(String n)
	  {
		  super(n);
		  System.out.println("type of account="+n);
	  }
		
	public void loanpayment()
		{
			System.out.println("loan payment through bank account");
		}
		public void mobilerecharge()
		{
			System.out.println("pay mobile recharge through bank account");	
		}
		
		public void electricitybill()
		{
			System.out.println("pay electricitybill through bank account");	
		}
  }
  class Wallet extends Paymentsapp
{    
	  String n;
	  Wallet(String n)
	  {
		  super(n);
		  System.out.println("type of wallet="+n);
	  }
	public void loanpayment()
	{
		System.out.println("loan payment through wallet");
	}
	public void mobilerecharge()
	{
		System.out.println("pay mobile recharge through wallet");	
	}
	
	public void electricitybill()
	{
		System.out.println("pay electricitybill through wallet ");	
	}
}
  class Autopay extends Paymentsapp
  { 
	  int amount;
	  Autopay(String n,int amount)
	  {
		  super(n);
		  this.amount=amount;
		  System.out.println("type of Autodebit="+n);
		  System.out.println("amount="+amount);
	  }
	  public void loanpayment()
		{
			System.out.println("loan payment through Autodebit");
		}
		public void mobilerecharge()
		{
			System.out.println("pay mobile recharge through Autodebit");	
		}
		
		public void electricitybill()
		{
			System.out.println("pay electricitybill through Autodebit");	
		}
  }


public class Abstraction {

	public static void main(String[] args) 
	{
	//	Paymentsapp p1=new Paymentsapp();
	 Account ac=new Account("phonepay attched bankaccount is SBI");
	 ac.loanpayment();
	 Wallet w1=new Wallet("phonpay wallet");
       w1.mobilerecharge();
     Autopay a1 = new Autopay("Auto debit from bank account",5000);
      a1.electricitybill();
	}

}
