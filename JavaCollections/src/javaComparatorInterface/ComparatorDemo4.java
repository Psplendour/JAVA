package javaComparatorInterface;
//Write a program to insert String and String Buffer object into TreeSet where sorting order is increasing length order 
//if two objects having the same length then consider their Alphabetical order.
import java.util.*;
public class ComparatorDemo4 {

	public static void main(String[] args) {
		//MyComparator4 c =new MyComparator4();
		//TreeSet<Integer> t =new TreeSet<Integer>(c);
		TreeSet t =new TreeSet(new MyComparator4()); //Also can be used
		
		t.add("A");//No comparison Required for adding first element
		t.add(new StringBuffer("ABC")); //JVM internally call compare()
		t.add(new StringBuffer("AA")); 
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}
