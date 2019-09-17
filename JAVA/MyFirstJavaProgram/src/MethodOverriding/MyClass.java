package MethodOverriding;
//Method Overriding in Java
public class MyClass {

	public static void main(String[] args) {
		Bank intrest1 = new Bank_abc();
		System.out.println(intrest1.getInterestRate());
		Bank intrest2 = new Bank_xyz();
		System.out.println(intrest2.getInterestRate());
		}
}
