package collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declare the Linked list
	  //  LinkedList<Integer>l=new LinkedList<Integer>();  //it's allows us to store integer(number)type data
	   // LinkedList<String>l=new LinkedList<String>(); //it's allows us to store only string type of data
		LinkedList l = new LinkedList();
	//if we want to add the hetrogeneous data	
		l.add(100);
		l.add("NEW");
		l.add(14.6);
		l.add('V');
		l.add(true);
		l.add(null);
		System.out.println(l); // [100, NEW, 14.6, V, true, null]
		System.out.println("size of the linked list="+l.size());
		//remove the element from linked list
		l.remove(3);
		System.out.println("after removing a element from linked list:"+l); //[100, NEW, 14.6, true, null]
       
		//adding the element in the middle of index-insertion
		l.add(4,"Java");
		System.out.println("after inserting a element in linked list:"+l); //[100, NEW, 14.6, true, Java, null]
		//retriving element/value
		System.out.println(l.get(4)); //java
		// change the element from list
		l.set(5,75465456655l);
		System.out.println("after change an element in linked list:"+l); //[100, NEW, 14.6, true, Java, 75465456655]
		//fetch the java is present or not we use Contains().....
		System.out.println(l.contains("Java")); //true
		System.out.println(l.contains("C#")); //false
		//check linked list have elements or not we use isEmpty(obj)...
		System.out.println(l.isEmpty()); //false
		
		//reading elements from linked list using for loop
		System.out.println("Reading the elements from linked list using for loop");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		//reading elements from linked list using for each loop
	    System.out.println("Reading the elements from linked list using for each loop");
	     for(Object e:l) // here all kinds of data we can store in a e variable i.e-object
	     {
		   System.out.println(e);
		}
	     
	   //reading elements from linked list using iterator
			System.out.println("Reading the elements from linked list using iterator");
			Iterator it = l.iterator(); //hasnext() checks the next element is present in the linked list
			while(it.hasNext()) ///next() just move to the next statement
			{
				System.out.println(it.next());
			}
			
				
		
		
		
		
		
		
		
		
	}

}