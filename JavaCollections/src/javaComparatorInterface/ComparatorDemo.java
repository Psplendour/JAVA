package javaComparatorInterface;
import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) {
		MyComparator c =new MyComparator();
		TreeSet<Integer> t =new TreeSet<Integer>(c);
		//TreeSet<Integer> t =new TreeSet<Integer>(new MyComparator()); Also can be used
		
		t.add(10);//No comparison Required for adding first element
		t.add(0); //JVM internally call compare()
		t.add(15);
		t.add(20);
		t.add(20);
		
		System.out.println(t);
	}

}
