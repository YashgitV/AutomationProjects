
public class Arrayforeach {

	public static void main(String[] args) 
	{
		System.out.println("manin method started");
		int[]ary = {12,23,11,34,54,5};
		System.out.println("size="+ary.length);
		for(int index=0;index<ary.length;index++)
		{
			System.out.println(ary[index]);
		}
		System.out.println("retrieve elements using for each loop");
		for(int a:ary)
		{
			System.out.println(a);
		}
		System.out.println("manin method ended");
	}

}
