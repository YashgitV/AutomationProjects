class Food
{
	String itemname;
	int price;
	int quantity;
	public void eat(String itemname,int price,int quantity)
	{
		this.itemname=itemname;
		this.price=price;
		this.quantity=quantity;
		System.out.println("Food delivery");
	}
}
class Swiggy extends Food
{
	public void eat(String itemname,int price)
	{
		this.itemname=itemname;
		this.price=price;
		System.out.println("food delivery through Swiggy");
       System.out.println("itemname="+itemname);
       System.out.println("price="+price);
	}
}
	
	class Foodpanda extends Food
	{
		public void eat(String itemname,int quantity,int price)
		{
			this.itemname=itemname;
			this.quantity=quantity;
			this.price=price;			
			System.out.println("Food delievery thorugh food panda");
			 System.out.println("itemname="+itemname);
			 System.out.println("quantity="+quantity);
			 System.out.println("price="+price);
		    
		}
	}
public class Polymerphism {

	public static void main(String[] args) 
	{
	
		 System.out.println("main method started");
		  Foodpanda f1=new Foodpanda();
		  f1.eat("biryani", 3,500);
		  Swiggy s1 = new Swiggy();
		  s1.eat("leg piece",70);	  
	       System.out.println("main method ended");
	}

}
