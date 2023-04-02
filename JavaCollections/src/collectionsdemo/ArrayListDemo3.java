package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		String ar[]= {"java","C#","Python"};
		for(String value:ar)
		{
			System.out.println(value);
		}
		ArrayList al = new ArrayList(Arrays.asList(ar));
		System.out.println(al);
		
		

	}

}
