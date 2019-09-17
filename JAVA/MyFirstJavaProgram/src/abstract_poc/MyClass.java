package abstract_poc;
//Abstract Methods and Classes

//Whenever a class is abstract only then it's method can be abstract.
//For Abstract method no need to give body.
//We need to implement the abstract method in subclass
//class can be extended but interfaces can only be implemented
public class MyClass {

	public static void main(String[] args) {
		Shape c = new Circle();
		Shape r = new Rectangle();
		
		c.draw();
		r.draw();
		}
}
