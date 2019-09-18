package javaCollectons;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Ram");
		vec.add("Amit");
		vec.add("Ashish");
		vec.add("Garima");
		
		Iterator itr = vec.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Z".compareTo("A")); 
	}
}
//Vector uses a dynamic array to store the data elements.
//It is similar to ArrayList.
//However, It is synchronized and contains many methods that are not the part of Collection framework.