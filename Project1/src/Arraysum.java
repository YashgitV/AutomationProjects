
public class Arraysum {

	public static int even(int[]ars) 
	{
      int sum=0;
      for(int i=0;i<ars.length;i++)
      {
    	  if(ars[i]%2==0)
    	  {  		  
    	  sum = sum+ars[i];
      }
      }
      return sum;
	}
	public static int odd(int[]ars)
	{
		int sum1=0;
		for(int i=0;i<ars.length;i++)
		{
			if(ars[i]%2!=0)
			{
				sum1=sum1+ars[i];
			}
		}
		return sum1;
	}
	public static void main(String[]args)
	{
		int[]ars= {12,45,24,15,16,56,14,87};
		int sum=even(ars);
		 int sum1=odd(ars);
      System.out.println("sum="+sum);
      System.out.println("sum1="+sum1);
	}

}
