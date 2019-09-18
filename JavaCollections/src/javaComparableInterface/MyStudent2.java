package javaComparableInterface;
import java.util.*;
public class MyStudent2 {

	public static void main(String[] args) {
		ArrayList<Student2> al=new ArrayList<Student2>();    
		al.add(new Student2(101,"Vijay",23));   //Internally JVM call the compareTo method while adding the new object to the array 
		al.add(new Student2(106,"Ajay",27));   //Internally JVM call the compareTo method while adding the new object to the array  
		al.add(new Student2(105,"Jai",21));     //Internally JVM call the compareTo method while adding the new object to the array 
		    
		Collections.sort(al);    
		for(Student2 st:al){    
		System.out.println(st.rollno+" "+st.name+" "+st.age);    
		}    

	}

}
