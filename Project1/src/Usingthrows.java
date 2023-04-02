
public class Usingthrows {
	
	static int display(int a,int b)throws ArithmeticException
	{
		int c=a/b;
		return c;
	}

	public static void main(String[] args) {
		Usingthrows u1=new Usingthrows();
		try
		{
        System.out.println(u1.display(10,3));
        }
        catch(ArithmeticException e)
		{
        	System.out.println("Execpetion handled");
		}
	}

}
