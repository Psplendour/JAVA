package IncrementAndAssignOperator;

public class IncOperator {

	public static void main(String[] args) {
		int x=10,y=10,z=10;
		x++; //Post increment 
		System.out.println(x);//output:11
		
		System.out.println(y++); //output:10
		System.out.println(y); //output:11
		
		++z;//pre increment
		System.out.println(++z);//output:12
		System.out.println(z); //output:12
		
	}
}
