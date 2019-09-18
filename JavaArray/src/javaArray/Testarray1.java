package javaArray;
//Java Program to illustrate the use of declaration,instantiation and initialization of Java array in a single line  
public class Testarray1 {

	public static void main(String[] args) {
		int a[]= {5,3,4,6,8,4};//declaration, instantiation and initialization
		
		for(int i=0;i<a.length;i++)//length is the property of array 
		{
         System.out.println(a[i]);
	    }
		}
}