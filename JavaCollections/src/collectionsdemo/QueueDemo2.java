package collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args) {

         LinkedList l = new LinkedList();
     	// add the elements using add(),offer()
 		l.add("A");
 		l.add("B");
 		l.add("C");
 		l.add("C"); 
 		l.add(120);
 		
 		
 		System.out.println(l); ///[A, B, C, C] ...Insertion order is preserved & duplicates are allowed
 		
 		//get the head element..element(),peek()
 		// System.out.println(l.element()); //A
 		// System.out.println(l.peek()); //A
 		
 		//return & remove element from queue...remove(),peek()..
 		/*	System.out.println(l.remove()); //A
 		System.out.println(l); // [B, C, C]  */
 		
 		System.out.println(l.poll()); //A
 		System.out.println(l); //[B, C, C, 120] 
 		
 		//using for iterator.......
 		Iterator it =l.iterator();
 		while(it.hasNext())
 		{
 			System.out.println(it.next());
 		}
 		//using for each loop.......
 		for(Object e:l)
 		{
 			System.out.println(e);
 		} 
 		
 	}

 


	}

