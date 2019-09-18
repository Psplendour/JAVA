package javaCollectons;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> LL= new LinkedList<String>();
		
		LL.add("Ravi");
		LL.add("Vijay");
		LL.add("Sohan");
		LL.add("Ajay");
		
		Iterator itr = LL.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}
}
//LinkedList implements the Collection interface. 
//It uses a doubly linked list internally to store the elements. 
//It can store the duplicate elements. 
//It maintains the insertion order and is not synchronized.
//In LinkedList, the manipulation is fast because no shifting is required.
