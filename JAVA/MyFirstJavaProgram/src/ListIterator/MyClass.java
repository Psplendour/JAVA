package ListIterator;
//ListIterator in Java
import java.util.ArrayList;
import java.util.ListIterator;

/*public boolean hasNext();
public Object next();
public boolean hasPrevious();
public Object previous();
*/
public class MyClass {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Tom");
		name.add("Don");
		name.add("Ram");
		name.add("Shayam");
		name.add("Mohan");
		
//public boolean hasNext(); -->iterate from the first element of the Array
//public Object next();
		
		ListIterator<String> itr =name.listIterator(); //ListIterator declaration
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("-------------------------");
		 
//public boolean hasPrevious();-->iterate from the last element of the Array
//public Object previous();	 
		 while(itr.hasPrevious())
		 {
			 System.out.println(itr.previous());
		 }
		 }

}
