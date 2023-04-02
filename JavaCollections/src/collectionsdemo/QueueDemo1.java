package collectionsdemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {
	
	public static void main(String[]args)
	{
		//declare priority queue
		
		PriorityQueue q = new PriorityQueue();
		
		// add the elements using add(),offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("C"); 
		
		
		System.out.println(q); ///[A, B, C, C] ...Insertion order is preserved & duplicates are allowed
		
		//get the head element..element(),peek()
		// System.out.println(q.element()); //A
		// System.out.println(q.peek()); //A
		
		//return & remove element from queue...remove(),peek()..
		/*	System.out.println(q.remove()); //A
		System.out.println(q); // [B, C, C]  */
		
	/*	System.out.println(q.poll()); //A
		System.out.println(q); //[B, C, C] */
		
		Iterator it =q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object e:q)
		{
			System.out.println(e);
		}
	}

}
