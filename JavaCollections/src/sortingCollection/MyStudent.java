package sortingCollection;
//Example to sort user-defined class objects
import java.util.*;
public class MyStudent {

	public static void main(String[] args) {
		 ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("Viru"));  
	      al.add(new Student("Saurav"));  
	      al.add(new Student("Mukesh"));  
	      al.add(new Student("Tahir"));  
	      
	    Collections.sort(al); 
	    for (Student s : al) {  
	      System.out.println(s.name);  
	    }  

	}

}
