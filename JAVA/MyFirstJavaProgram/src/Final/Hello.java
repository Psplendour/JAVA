package Final;
//The final keyword in Java
/*
 Final key has a numerous way to use.
 1.A Final class cannot be subclassed(if a base calss is final then child class can't be accessed)
 2.A final variabe  can only initiated once
 3.A final method  cannot  be overridden by subclass  (learn in further class)
 */
public class Hello{
	public static void main(String[] args){
		
		Hello1 hello = new  Hello1();
	    //hello.age=20; Error:The final field Hello1.age cannot be assigned
		
		//2.A final variabe  can only initiated once (Implemented here)
		//Once the variable is declared as final this means it is initialed once,their value is not change after initalizing once.
		}
	}
