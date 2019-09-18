package javaCollectons;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  //Creating and adding elements  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		Iterator<String> itr=set.iterator();  //traversing elements  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		
		System.out.println(set);//[Ajay, Ravi, Vijay]  Duplicate is not allowed and Output follow the Default Natural Sorting Order

	}

}
