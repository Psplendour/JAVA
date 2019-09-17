package arrayList;

import java.util.ArrayList;

public class MyClass1 {

	public static void main(String[] args) {
		//int simple_array[] = new int[];  //{1,2,3,4,5}
				ArrayList<Integer> myList= new ArrayList<Integer>(3); 
				//Adding the value to the array element
				myList.add(5);
				myList.add(10);
				myList.add(30);
				myList.add(15);
				myList.add(20);
				myList.add(21);
				myList.add(22);
				
				for(Integer x :myList)
				{
					System.out.println(x);
				}
				System.out.println("Size is "+myList.size());
				
				//After removing the element of index 2 
				myList.remove(2);
				for(Integer x :myList)
				{
					System.out.println(x);
				}
				System.out.println("Size is "+myList.size());
				
				//After clearing values of array the element of index 2 
				myList.clear();
				for(Integer x :myList)
				{
					System.out.println(x);
				}
				System.out.println("Size is "+myList.size());
				
				//Add a value to a specific index
				
				myList.trimToSize();//trim the size of array 

	}
}
