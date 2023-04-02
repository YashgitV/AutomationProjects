package collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
			
     	//HashSet hs = new HashSet(100, (float)0.90); //initial capacity 100,load factor is 90		
     	//HashSet<Integer> hs = new HashSet<Integer>(); //if we want pass only integer type of data
		HashSet hs = new HashSet(); //default capacity is 16 load factor is 0.75
		
		//add the elements into hashset
		hs.add(120);
		hs.add("Test");
		hs.add(12.8);
		hs.add('V');
		hs.add(true);
		hs.add(null);
		System.out.println(hs); //[null, 12.8, Test, V, 120, true]
		//remove
		hs.remove(12.8); 
		System.out.println("after removing element="+hs); //[null, Test, V, 120, true]
		System.out.println("after removing element="+hs.size()); //how many elements present in hashset
		//element is present in hashset or not
		System.out.println(hs.contains(12.8)); //false
		System.out.println(hs.contains("Test"));//true
		//hashset is empty or not
		System.out.println(hs.isEmpty()); ///false
		
		//reading the all elements in hashset
		for(Object e:hs)
		{
			System.out.println(e);
		}
		Iterator it =hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
