package ForLoop;
/*The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, 
it is recommended to use for loop.*/
//Java For-each loop example which prints the  elements of the array
public class ForEeachLoop {

	public static void main(String[] args) {
		int arr[]= {20,25,32,65,42,15};
		for(int i:arr) 
		{
			System.out.println(i);
		}

	}

}
//The for-each loop is used to traverse array or collection in java. 
//It works on elements basis not index. It returns element one by one in the defined variable.
