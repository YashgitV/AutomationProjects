
public class Exceptionhandling {

	public static void main(String[] args)
	{		
		try
		{
		int a=10;int b=0;
		int c=a/b;
		System.out.println("c="+c);
		System.out.println("executed with out errors");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("finally block statements are executed even though execpetion is not handled or not");
		}
	}

}
