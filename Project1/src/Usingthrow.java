
public class Usingthrow {
	
	static void verify(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) 
	{
       verify(16);
       System.out.println("Exception is handled");
      }
      
	}
