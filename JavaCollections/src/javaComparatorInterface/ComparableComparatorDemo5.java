package javaComparatorInterface;
import java.util.*;
public class ComparableComparatorDemo5 {

	public static void main(String[] args) {
		Employee e1 =new Employee("nag",100);
		Employee e2 =new Employee("balaish",200);
		Employee e3 =new Employee("chiru",50);
		Employee e4 =new Employee("venki",150);
		Employee e5 =new Employee("nag",100);
		
		TreeSet<Employee> t =new TreeSet<Employee>();
		t.add(e1);//No comparison Required for adding first element
		t.add(e2); //JVM internally call compareTo()
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}

}
