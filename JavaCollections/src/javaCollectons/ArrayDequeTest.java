package javaCollectons;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  //Creating Deque and adding elements  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		
		for (String str : deque) //Traversing elements  
		{  
		System.out.println(str);  
		}  

	}

}
