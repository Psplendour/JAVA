package HashSet;
// HashSet in Java
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class MyClass {

	public static void main(String[] args) {
		HashSet <String> name = new HashSet<String>();
		
		name.add("Tom");
		name.add("Tom");
		name.add("Ram");
		name.add("Shayam");
		name.add("Mohan");
		
		 Iterator<String> itr =name.iterator(); //Iterator declaration
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
      }
	}
//ArrayList Does not validate duplicates.
//but you have fully control over the order of the entries in ArrayList.

//HashSet ensures there are no duplicates.
//method but doesn't preserve order in HashSet.
//the duplicate elements removed therefore Tom is shown once in the output