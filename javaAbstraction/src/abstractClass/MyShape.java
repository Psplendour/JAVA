package abstractClass;
//Understanding the real scenario of Abstract class
public class MyShape {

	public static void main(String[] args) {
		
		Shape s;//In a real scenario, object is provided through method, e.g., getShape() method  
		s= new Circle();
		s.draw();
		s= new Rectangle();
		s.draw();
		}
}
// If there is an abstract method in a class, that class must be abstract.
