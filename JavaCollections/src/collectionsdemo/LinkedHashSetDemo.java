package collectionsdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//Declare the LinkedHashSet
		//LinkedHashSet<Integer> lset= new LinkedHashSet<Integer>(); //it allow us to store integer type data
		//HashSet lset= new HashSet();
		LinkedHashSet lset= new LinkedHashSet();
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		System.out.println(lset); // [400, 100, 500, 200, 300]  .....Hashset [100, 200, 300, 400, 500]....LinkedHashSet
		

	}

}
