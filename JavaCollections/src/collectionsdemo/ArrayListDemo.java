package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// ArrayList al = new ArrayList(); //it allows us to store hetrogeneous data
		// ArrayList<Integer> al = new ArrayList<Integer>(); //it allows us to store integer type data
		// ArrayList<String> al = new ArrayList<String>(); //it allows us to store String type data
		// List al= new ArrayList();
		ArrayList al = new ArrayList(); //it allows us to store hetrogeneous data
		
		//add the new element to the array list
		al.add(120);
		al.add("Arraylist");
		al.add(139.8);
		al.add('b');
		al.add(120);
		System.out.println(al); // [120, Arraylist, 139.8, b, 120]
		
		//if we want to find the how many elements stored in the arraylist  will use size()
		System.out.println("No.of elements present in array list:"+al.size());
		
		//if we want the delete the element from index we use remove()
		al.remove(3); //either we pass index number
		//al.remove(139.8); //either we pass object
		System.out.println("after removing the element from array list :"+al); ///[120, Arraylist, 139.8, 120]
		System.out.println("now no.of elements in array list is:"+al.size());
		
		//insert a new element in a array list add(index,object)
		al.add(2,99999999776l);
		System.out.println("after added a new element in arraylist table is:"+al); //[120, Arraylist, 99999999776, 139.8, 120]
		System.out.println("now no.of elements in array list is:"+al.size());
		
		//Retrieve the object from array list we use get(index)
		System.out.println("retrieve object="+al.get(1)); //Arraylist here 1 is index of element/object
		
		//change the object from array list i.e, added new element in existing element with the help of Set(index,object)
		al.set(1,"Time");
		System.out.println("aray list after using change the existing element="+al); // [120, Time, 99999999776, 139.8, 120]
		
		///search the element/object is present in arraylist using Contains(object) -it returns true/false
		System.out.println("element is present in array list="+al.contains("Time")); //true
		System.out.println("element is present in array list="+al.contains("javaTime")); //false
		 
		//verify array list is empty will check using isEmpty()
		
		System.out.println("arraylist is empty="+al.isEmpty()); //false
		
		//for loop
		System.out.println("reading elements using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//for each loop
		System.out.println("reading elements using for each loop");
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		//iterator()
		System.out.println("reading elements using iterator");
		Iterator it= al.iterator();
		while(it.hasNext())  //hasnext method is returns true/false
		{
			System.out.println(it.next()); // next() method is used to print the element present in array list & move to next element
		}
		
		
		
		
		
		
		
		}

}
