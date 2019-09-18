package sortingCollection;
//Example to sort string objects
import java.util.*;
public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al); //It is used to sort the elements presents in the specified list of collection in ascending order.
		
		Iterator itr=al.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());

	}

}
}