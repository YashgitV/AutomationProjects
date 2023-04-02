package collectionsdemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		//linked list specific methods
		LinkedList l = new LinkedList();
		l.add("bat");
		l.add("ball");
		l.add("stick");
		l.add("pads");
		System.out.println(l); //[bat, ball, stick, pads]
		l.addFirst("Cricket");
		l.addLast("batsman");
		System.out.println(l);
		System.out.println(l.getFirst()); ///give the first element
		System.out.println(l.getLast()); ///give the last element
		l.removeFirst();
		l.removeLast();
		System.out.println("after removing first& last element="+l);
	}

}
