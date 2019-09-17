package IfElseAndRationalOperator;

import java.util.Scanner;
/*
 == is equal to
 1=  is not equal to
 > is greater than
 < is less than
 >= is greater than or equal to
 <= is less than or equal to
 */
public class ElseIfAndRationalOperator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the no");
		int x =scan.nextInt();
		 
		if(x==10) 
		{
			System.out.println("yes x==10");
		}
		else {System.out.println("No x!=10");}
		}
	}


