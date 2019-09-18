package javaTreeSet;
//various NavigableSet operations
import java.util.*; 
public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
        set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        System.out.println("Initial Set: "+set);  
          
        System.out.println("Reverse Set: "+set.descendingSet());  
          
        System.out.println("Head Set: "+set.headSet("C", true));  
         
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
          
        System.out.println("TailSet: "+set.tailSet("C", false));  
}  

}
//True:- Inclusive
//False:-Exclusive
/*
Initial Set: [A, B, C, D, E]
Reverse Set: [E, D, C, B, A]
Head Set: [A, B, C]
SubSet: [B, C, D, E]
TailSet: [D, E]
*/
