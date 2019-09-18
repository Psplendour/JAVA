package javaComparatorInterface;
//Various possible implementations of compare() method
import java.util.Comparator;

public class MyComparator1  implements Comparator<Object>{
       public int compare(Object obj1, Object obj2)
	    {
		Integer i1 =(Integer)obj1;
		Integer i2 =(Integer)obj2;
		//return i1.compareTo(i2); //[0, 10, 15, 20] ascending Order
	    //return -i1.compareTo(i2); //[20, 15, 10, 0] descending order
		return i2.compareTo(i1);   //[20, 15, 10, 0] descending order
		//return -i2.compareTo(i1); //[0, 10, 15, 20] ascending Order
		//return +1; //[10, 0, 15, 20, 20]  insertion Order
		//return -1; //[20, 20, 15, 0, 10] reverse insertion Order
		//return 0;   //[10]
}
}
