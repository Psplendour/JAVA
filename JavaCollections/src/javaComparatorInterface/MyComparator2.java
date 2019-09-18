package javaComparatorInterface;
//Write a program to insert object into the TreeSet where sorting order is reverse of Alphabetical order
import java.util.Comparator;

public class MyComparator2  implements Comparator<Object>{
       public int compare(Object obj1, Object obj2)
	    {
		String s1  =(String)obj1;
		String s2  =(String)obj2;
		
		return s1.compareTo(s2);
}
}
