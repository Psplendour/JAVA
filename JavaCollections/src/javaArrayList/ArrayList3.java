package javaArrayList;
//Iterating Collection through Iterator interface

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList3 {

	public static void main(String[] args) {
		  
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  System.out.println(list); //[Ravi, Vijay, Ravi, Ajay]
		  
		  Iterator itr=list.iterator();  //Traversing list through Iterator 
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  
		 }  

	}
//Duplicate allowed 
//Insertion Order Preserved

