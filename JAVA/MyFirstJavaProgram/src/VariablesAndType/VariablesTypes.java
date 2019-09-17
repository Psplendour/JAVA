package VariablesAndType;
//Variables and Types in Java
public class VariablesTypes {
	/*
	 byte (number,1 byte)
	 short (number,2 byte)
	 int (number,4 byte)
	 long (number,2 byte)
	 float (float number,4 byte)
	 double (float number,8 byte)
	 char (a character,2 byte)
	 boolean (true or false,1 byte)
	 */
public static void main(String[] args) {
	int my_integar=10;
	short my_short=250;
	//  All decimal values are double by default so to convert them into float we have to mention float before that number
	float my_long=(float)10.2;
	double my_double=10.20;
	char my_char='A';
	boolean is_true=true;
System.out.println(my_integar);
System.out.println(my_short);	
System.out.println(my_long);	
System.out.println(my_double);	
System.out.println(my_char);	
System.out.println(is_true);	
}
}
