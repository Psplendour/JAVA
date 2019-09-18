package javaComparatorInterface;
//Write a program to insert object into the TreeSet where sorting order is reverse of Alphabetical order
import java.util.*;
public class ComparatorDemo2 {

	public static void main(String[] args) {
		
		TreeSet<String> t =new TreeSet<String>(new MyComparator2());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajKumari");
		t.add("GangaBhawani");
		t.add("Ramulamma");
		System.out.println(t);
	}

}
