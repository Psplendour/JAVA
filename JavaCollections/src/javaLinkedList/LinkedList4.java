package javaLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

//Java LinkedList Example to reverse a list of elements
public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        System.out.println(ll);
        
        //Traversing the list of elements in reverse order  
        Iterator<String> i=ll.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        

	}

}
