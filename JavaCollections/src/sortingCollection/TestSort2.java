package sortingCollection;
import java.util.*;
public class TestSort2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
        al.add("Viru");    
        al.add("Saurav");    
        al.add("Mukesh");    
        al.add("Tahir");   
          
        Collections.sort(al,Collections.reverseOrder()); //It is used to reverse the order of the elements in the specified list.
        
        Iterator itr=al.iterator();  
        while(itr.hasNext())  
        {  
            System.out.println(itr.next());  
        }  

	}

}
