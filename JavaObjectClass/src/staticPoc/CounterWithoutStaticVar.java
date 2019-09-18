package staticPoc;
//Program of the counter without static variable
public class CounterWithoutStaticVar {
	int count=0;
	
	CounterWithoutStaticVar()
	{
		count++;
		System.out.println(count);
	}
}

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  