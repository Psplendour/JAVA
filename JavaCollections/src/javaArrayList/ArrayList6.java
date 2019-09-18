package javaArrayList;
//User-defined class objects in Java ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList6 {

	public static void main(String[] args) {
		Student s1 =new Student(101,"Sonoo",23);     //Creating user-defined class objects  
		Student s2=new Student(102,"Ravi",21);
		Student s3=new Student(103,"Hanumat",25);  
		
		ArrayList<Student> list=new ArrayList<Student>();  //creating Arraylist  
		list.add(s1);//adding Student class object  
		list.add(s2);
		list.add(s3);
		
		Iterator<Student> itr = list.iterator(); //Getting Iterator 
		
		while(itr.hasNext()) //traversing elements of ArrayList object 
		{
			Student st=(Student) itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
