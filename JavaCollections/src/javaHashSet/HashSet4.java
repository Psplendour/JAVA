package javaHashSet;
//Java HashSet from another Collection
import java.util.*;
public class HashSet4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
          
        HashSet<String> set=new HashSet<String>(list);  
        set.add("Gaurav");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  

	}

}
//Duplicate not allowed
//Order not preserved