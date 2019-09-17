package SwitchStatement;
//switch Statement in Java
public class SwitchStatement {

	public static void main(String[] args) {
		int score=6;
		
		switch (score)
		{
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
