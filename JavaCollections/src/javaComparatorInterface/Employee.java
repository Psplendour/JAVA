package javaComparatorInterface;
//Write a program to insert String and String Buffer object into TreeSet where sorting order is increasing length order 
//if two objects having the same length then consider their Alphabetical order.
import java.util.Comparator;
public class Employee  implements Comparable<Employee>
{
   String name;
   int eid;
   
   Employee(String Name,int eid)
   {
	   this.eid=eid;
	   this.name=name;
   }
   
   public String toString()
   {
	   return name+"...."+eid;
   }
   
   public int compareTo(Employee e) 
   {
	   
	   if(eid<e.eid)
	   {
		   return -1;
	   }
	   else if(eid>e.eid)
	   {
		   return +1;
	   }
	   else
	   {
		   return 0;
	   }
   }
}
