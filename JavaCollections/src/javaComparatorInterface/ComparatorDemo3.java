package javaComparatorInterface;
//Write a program to insert StringBuffer into the TreeSet where sorting order is  Alphabetical order
import java.util.*;
public class ComparatorDemo3 {

	public static void main(String[] args) {
	
		TreeSet<StringBuffer> t =new TreeSet<StringBuffer>(new MyComparator3());
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		
		System.out.println(t);
	}

}
