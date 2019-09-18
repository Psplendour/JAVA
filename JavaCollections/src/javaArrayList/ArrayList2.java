package javaArrayList;
//creating new generic arraylist  
import java.util.ArrayList;

public class ArrayList2 {
          public static void main(String[] args) {
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay"); 
	      //list.add(1);   Getting CompileTime Error As This array list is Generic ArrayList
	      
	      System.out.println(list); //Invoking arraylist object   

	}

}

//Duplicate allowed 
//Insertion Order Preserved