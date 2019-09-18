package javaComparatorInterface;
//Write a program to insert String and String Buffer object into TreeSet where sorting order is increasing length order 
//if two objects having the same length then consider their Alphabetical order.
import java.util.Comparator;
public class MyComparator4  implements Comparator<Object>{
        public int compare(Object obj1, Object obj2) {
		String s1 =obj1.toString();
		String s2 =obj2.toString();
	    int i1=s1.length();
	    int i2=s2.length();
	    
		if (i1<i2)
	    return -1;
		else if (i1>i2)
		return +1;
		else
        return s1.compareTo(s2);
	    //return 0;
			
	}

}
