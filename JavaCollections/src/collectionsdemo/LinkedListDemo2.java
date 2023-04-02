package collectionsdemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

       LinkedList l = new LinkedList();
       l.add("S");
       l.add("R");
       l.add("T");
       l.add("A");
       l.add("B");
       l.add("C");
      ///add all elements into the new linked list
       LinkedList l_dup = new LinkedList();
       l_dup.addAll(l);
       System.out.println("New linked list="+l_dup); //[S, R, T, A, B, C]
       l_dup.removeAll(l);
       System.out.println(l_dup); //[]
       System.out.println(l_dup.size());
       //sorting the old linkedlist we use Collections.sort() 
       //note:sorting only possible if we have same kind of data(i.e, homogeneous data)
        System.out.println("Before sort="+l); //[S, R, T, A, B, C]
        Collections.sort(l);
        System.out.println("after sort="+l); //[A, B, C, R, S, T]
        
       ///reverse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("reverse order="+l); //[T, S, R, C, B, A]
        
        //shuffle....
        Collections.shuffle(l);
        System.out.println("after shuffle the linked list="+l); //[C, R, S, T, B, A]
	}

}
