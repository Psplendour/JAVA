package javaComparatorInterface;
//Write a program to insert StringBuffer into the TreeSet where sorting order is  Alphabetical order
import java.util.Comparator;

public class MyComparator3  implements Comparator<Object>{
       public int compare(Object obj1, Object obj2)
	    {
		String s1  =obj1.toString();
		String s2  =obj2.toString();
		
		return s1.compareTo(s2);
}
}
