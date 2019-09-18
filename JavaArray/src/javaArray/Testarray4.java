package javaArray;
//Passing Array to a Method in Java
public class Testarray4 {

	   static void minimum(int arr[])
          {  
	          int min=arr[0];  
	          for(int i=1;i<arr.length;i++)
	          {
	          if(min>arr[i]) 
	          {
	          min=arr[i];
	          }
	          }
	          System.out.println(min);
    	  }
	 
	       public static void main(String[] args) {
		    int a[]={33,3,4,5,2};//declaring and initializing an array
		    minimum(a);//passing array to method

            }
}