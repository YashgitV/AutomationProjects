package com.Program.Practice;

public class ConstrutorOverloading {
	
	String journeytype,destination;
	int distance,price;
	ConstrutorOverloading(String journeytype,String destination,int distance)
	{
		this.journeytype=journeytype;
		this.destination=destination;
		this.distance = distance;
	}
	
	ConstrutorOverloading(String journeytype,String destination,int distance,int price)
	{
		this.journeytype=journeytype;
		this.destination=destination;
		this.distance = distance;
		this.price=price;
	}
	
	ConstrutorOverloading(String journeytype,int price,String destination)
	{
		this.journeytype=journeytype;
		this.price = price;
		this.destination=destination;
	}
	
	public static void main(String[] args) {

		ConstrutorOverloading cv1 = new ConstrutorOverloading("Train","hyderabad",320,500);
	    System.out.println("journeytype="+cv1.journeytype);
	    System.out.println("destination="+cv1.destination);
	    System.out.println("distance="+cv1.distance);
	    System.out.println("price="+cv1.price);
	    ConstrutorOverloading cv2 = new ConstrutorOverloading("Bus","Chennai",320);
	    System.out.println("journeytype="+cv2.journeytype);
	    System.out.println("destination="+cv2.destination);
	    System.out.println("distance="+cv2.distance);
	    ConstrutorOverloading cv3 = new ConstrutorOverloading("Bike",350,"Ongole");
	    System.out.println("journeytype="+cv3.journeytype);
	    System.out.println("destination="+cv3.destination);
	    System.out.println("price="+cv3.price);

	}

}
