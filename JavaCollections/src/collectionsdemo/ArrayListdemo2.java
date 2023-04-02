package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListdemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("S");
		al.add("R");
		al.add("T");
		al.add("A");
		al.add("B");
		al.add("C");
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al); //[ S, R, T,A ,B ,C ]
     	al_dup.removeAll(al); ///remove the all elements from array list using removeAll(collection)
     	System.out.println("remove all elements from arraylist="+al_dup);
		System.out.println("Size of an arry list is="+al.size());
		
		// sort an array list...........Collections.sort()
		System.out.println("elements in the array list="+al);  // [ S, R, T,A ,B ,C ]
		Collections.sort(al);
		System.out.println("elements in the array list after sorting="+al); // [A, B, C, R, S, T]
		// sort an array list in a reverse order...........Collections.sort(al,collections.reverseorder())
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("elements in the array list after reverse the order="+al); //[T, S, R, C, B, A]
		// shuffle an array list...........Collections.Shuffle()
		Collections.shuffle(al);
		System.out.println("elements in the array list after shuffle="+al);
	}

}
