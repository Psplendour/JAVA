package javaCollectons;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
       public static void main(String[] args) {
	   HashSet<String> set=new HashSet<String>();//Creating HashSet and adding elements    
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
	    System.out.println(set);//[Vijay, Ravi, Ajay] Insertion Order not preserved
	    
		Iterator<String> itr=set.iterator(); 	//Traversing elements  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
//Duplicate not allowed