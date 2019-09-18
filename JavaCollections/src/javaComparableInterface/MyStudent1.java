package javaComparableInterface;
import java.util.*;
public class MyStudent1 {

	public static void main(String[] args) {
		ArrayList<Student1> list =new ArrayList<Student1>();
		list.add(new Student1(101,"Vijay",23));//Internally JVM call the compareTo method while adding the new object to the array 
		list.add(new Student1(106,"Ajay",27));  //Internally JVM call the compareTo method while adding the new object to the array 
		list.add(new Student1(105,"Jai",21)); //Internally JVM call the compareTo method while adding the new object to the array 
		
		Collections.sort(list); 
		for(Student1 s : list)
			System.out.println(s.rollno+" "+s.name+" "+s.age);
	}

}
