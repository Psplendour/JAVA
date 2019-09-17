package Inheritance;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		System.out.println("Enter the value of height of Rectangle ");
		rec.height=scan.nextInt();
		System.out.println("Enter the value of Weight of Rectangle ");
		rec.weight=scan.nextInt();

		Triangle tri = new  Triangle();
		System.out.println("Enter the value of height of Triangle ");
		tri.height=scan.nextInt();
		System.out.println("Enter the value of Weight of Triangle ");
		tri.weight=scan.nextInt();
			
		System.out.println("The area of the rectangle is "+rec.area());
		System.out.println("The area of the rectangle is "+tri.area());

	}

}
