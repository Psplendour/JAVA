package javaArrayList;
//creating old non-generic arraylist  
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("A");
		list.add(1);
		
		Iterator itr =list.iterator();
		
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
	}

}
//Duplicate allowed 
//Insertion Order Preserved