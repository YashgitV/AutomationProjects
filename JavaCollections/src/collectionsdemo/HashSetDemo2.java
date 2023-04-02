package collectionsdemo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer>evennum = new HashSet<Integer>();
		evennum.add(2);
		evennum.add(4);
		evennum.add(6);
		evennum.add(8);
		System.out.println("HashSet="+evennum); ////[2, 4, 6, 8]
		
		HashSet<Integer> num=new HashSet<Integer>();
		num.addAll(evennum);
		num.add(10);
		System.out.println("new Hashset="+num); //[2, 4, 6, 8, 10]
		
		//remove()
        num.removeAll(evennum);
        System.out.println("new Hashset="+num); // [10]
        
        
	}
}
