package SwitchStatement;
//switch Statement in Java
import java.util.Scanner;

public class SwitchStmtUserInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Score");
		int score = scan.nextInt();
		
		switch (score)
		{
		case 95:
		case 90:
			System.out.println("Grade A");
			break;
		case 60:
			System.out.println("Grade B");
			break;
		case 40:
			System.out.println("Grade C");
			break;
			default:
			System.out.println("Grade not define");
				}

	}

}