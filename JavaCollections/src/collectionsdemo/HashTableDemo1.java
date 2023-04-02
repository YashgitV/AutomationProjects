package collectionsdemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo1 {

	public static void main(String[] args) {

      //  Hashtable t = new Hashtable();
      //  Hashtable t = new(initial capacity); //create hashtable object with some capacity
        //  Hashtable t = new(initial capacity,fill ratio/load factor);
        Hashtable<Integer,String> t = new Hashtable<Integer,String>();
       
        t.put(100,"ram");
        t.put(101,"yash");
        t.put(102,"jan");
        t.put(103,"sam");
        t.put(104,"balu");
       // t.put(null,"ram"); //null keys,values are not allowed in hashtable
        System.out.println(t); ///// {104=balu, 103=sam, 102=jan, 101=yash, 100=ram}
        
        ///get the value from hashtable
        System.out.println(t.get(103)); ///sam
        ///remove the entry
        System.out.println(t.remove(103)); ///sam
        System.out.println(t); /// {104=balu, 102=jan, 101=yash, 100=ram}
        
        //checks key is present or not
        System.out.println(t.containsKey(103)); ////false
        System.out.println(t.containsKey(101)); //true
        
      //checks value is present or not
        System.out.println(t.containsValue("java")); ///false
        System.out.println(t.containsValue("balu")); //true
        
        /////hashtable is empty or not
        System.out.println(t.isEmpty()); //false
        
        ////get the all keys from hashtable
        System.out.println(t.keySet()); //[104, 102, 101, 100]
        ////get the all values from hashtable as collection
        System.out.println(t.values()); //[balu, jan, yash, ram]
        ///if we want to get the individual vales from hashtable
        /*   for(int i:t.keySet())
       {
        	System.out.println(i+"  "+t.get(i));
        }  
        
        for(Map.Entry entry:t.entrySet())
        {
        	System.out.println(entry.getKey()+"  "+entry.getValue());
        }  */
        
        Set s= t.entrySet();
        Iterator it= s.iterator();
        while(it.hasNext())
        {
        	Map.Entry entry=(Entry) it.next();
        	System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
