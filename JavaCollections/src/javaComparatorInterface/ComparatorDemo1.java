package javaComparatorInterface;
//Various possible implementations of compare() method
import java.util.*;
public class ComparatorDemo1 {

	public static void main(String[] args) {
		MyComparator1 c =new MyComparator1();
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
