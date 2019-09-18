package staticPoc;

public class CounterWithStaticVar {
	static int count=0;//will get memory only once and retain its value
	
	CounterWithStaticVar()
	{
		count++;//incrementing the value of static variable
		System.out.println(count);
	}
}
