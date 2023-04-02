package collectionsdemo;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		//union,intersection,difference
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		System.out.println(set1); //[1, 2, 3, 4, 5, 6]
		
	HashSet<Integer> set2=new HashSet<Integer>();
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		System.out.println(set2); //[2, 3, 4]
		
		//Union-remove the duplicate elements from set1&set2....addAll()
		set1.addAll(set2);
		System.out.println("Union="+set1); // [1, 2, 3, 4, 5, 6]
		//intersection--get common elements form set&set2........retainAll()
		//set1.retainAll(set2);
		//System.out.println("intersection="+set1);
		//find difference between set1 & set2.....removeAll()
		//set1.removeAll(set2);
		//System.out.println("difference="+set1); // [1, 5, 6]
		
		//subset
		System.out.println(set1.containsAll(set2));
		///System.out.println("subset="+set1); // [1, 2, 3, 4, 5, 6]
		
		
		
		
		
		
		
		
		
	}

}
