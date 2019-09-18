package javaArrayList;
//Iterating Collection through the for-each loop
import java.util.ArrayList;
public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		   
		  for(String obj:al)  //Traversing list through for-each loop  
		  System.out.println(obj); 

	}

}
