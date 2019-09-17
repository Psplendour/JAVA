package arrayList;
import java.util.ArrayList;
public class MyClass {

	public static void main(String[] args) {
		//int simple_array[] = new int[];  //{1,2,3,4,5}
		ArrayList<Integer> myList= new ArrayList<Integer>(3); 
		
		myList.add(5);
		myList.add(10);
		myList.add(15);
		myList.add(15);
		myList.add(20);
		myList.add(21);
		myList.add(22);
		//Advanced for loop
		int i=0;
		for( i=0;i<myList.size()-3;i++)
		{
		int j = myList.get(i);
		System.out.println(j);
		}
		
		System.out.println("Size is "+myList.size());
		}
	}
//Initail size or capacity of arraylist and can be changed as requirement
//size of array =no of  element present in the array list
