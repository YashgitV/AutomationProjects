package collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
  
	//declare hashmap
		 HashMap<Integer,String> hs= new HashMap<Integer,String>(); /////if we want store int,String type data in to hashmap
    	// HashMap hs= new HashMap();
		 hs.put(100,"yash");
		 hs.put(101,"ram");
		 hs.put(102,"sam");
		 hs.put(103,"raj");
		 hs.put(104,"balu");
		 
		 System.out.println(hs); //{100=yash, 101=ram, 102=sam, 103=raj, 104=balu}
		 
		 //if we want to get the key value....get(key)
		 System.out.println(hs.get(102)); //sam
		 //remove the entry by passing key--remove(key)
		 System.out.println(hs.remove(103)); // raj
		 System.out.println(hs); //{100=yash, 101=ram, 102=sam, 104=balu}
		 
		 //particular key is present in the hashmap or not ...containsKey()
		 System.out.println(hs.containsKey(103)); ///false
		 System.out.println(hs.containsKey(101)); //true
		 
		 ///checks the value is present in hashmap we use containsValue()..
		 System.out.println(hs.containsValue("raj")); //false
		 System.out.println(hs.containsValue("balu")); //true
		 
		 //checks the entries is empty...isEmpty()
		 System.out.println(hs.isEmpty()); ///false
		 
		 //get the only key values from map we use--keySet() it will return all keys as set
		 System.out.println(hs.keySet()); //[100, 101, 102, 104]
		 for(Object i:hs.keySet())
		 {
			 System.out.println(i);
		 }
		 //get the values from map we use....KeyValue().. it will return all values as collection
		  System.out.println(hs.values()); //[yash, ram, sam, balu]
		 for(Object i:hs.values())
		 {
			 System.out.println(i);
		 }
		 
		 /*	 for(Object i:hs.keySet())
		 {
			 System.out.println(i+"  "+hs.get(i));
		 } 
		 */
		 //if we want to return the entries we entrySet()... it will return all the entries as set
		 // System.out.println(hs.entrySet()); //[100=yash, 101=ram, 102=sam, 104=balu]
		 
		 /*	 for(Map.Entry entry:hs.entrySet())
		 {
			 System.out.println(entry.getKey()+"    "+entry.getValue());
		 }  */
		  
		 //Iterator 
		Set s = hs.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry)it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
      
	}

}
