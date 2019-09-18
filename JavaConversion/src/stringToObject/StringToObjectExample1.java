package stringToObject;

public class StringToObjectExample1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c=Class.forName("java.lang.String");  
		System.out.println("class name: "+c.getName());  
		System.out.println("super class name: "+c.getSuperclass().getName());  

	}

}
/*
Let's see the simple code to convert String to Class object in java using Class.forName() method. 
The Class.forName() method returns the instance of Class class which can be used to get the metadata of any class.
*/