class Movie
{
	public void profits()
	{
		System.out.println("vikram Movie profits from opening day in countrywide");
		System.out.println("No.of areas=1000");
		System.out.println("Daily shows=6");
		System.out.println("budget=60crores");
		System.out.println("movie collectionstill now=350crores");
	}
}
class Producer extends Movie
{
	public void updateprofit()
	{
		System.out.println("vikram Movie profits from opening day in worldwide");
		System.out.println("No.of areas=10000");
		System.out.println("Daily shows=7");
		System.out.println("budget=60crores");
		System.out.println("movie collectionstill now=1350crores");
	}
}
public class Upcasting {

	public static void main(String[] args)
	{
		Movie p1=new Producer();
		p1.profits();
		//p1.updateprofit(); ///getting compile time error because during upcasting only superclass behaviour is visible,subclass behaviour is not visible 

	}

}
