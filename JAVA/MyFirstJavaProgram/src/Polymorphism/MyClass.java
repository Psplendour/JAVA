package Polymorphism;
//Polymorphism in Java
//Polymorphism in Java is a concept by which we can perform a single action in different ways
public class MyClass {

	public static void main(String[] args) {
//here we uses three references (abc,def,xyz) of Bank Class for referring three different subclass or object of subclass Bank_abc,Bank_def and Bank_xyz
		Bank abc =new Bank_abc(); //As the Bank_abc extends Bank
		Bank def =new Bank_def(); //Bank_def extends Bank class 
		Bank xyz =new Bank_xyz(); //Bank_xyz extends Bank class
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());
		}
	}
