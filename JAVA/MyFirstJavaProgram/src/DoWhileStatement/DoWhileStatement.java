package DoWhileStatement;
//The do-while Statements (do-while Loops)

/*
 -->For while loop condition is checked before executing the loop
 but in Do While Loop first execution of loop is done after that condition is checked
 */

public class DoWhileStatement {

	public static void main(String[] args) {
		int i=10;
		do{
			System.out.println(i);
			i--;
		  }while(i>0);
		
	System.out.println("-------------------------------");
	
	int j=0;
	do{
		System.out.println(j);
		j++;
	  }while(j<=10);
	}
}
