package constructor;
//Example of Constructor Overloading
public class ConstrOverloadingMain {

	public static void main(String[] args) {
		ConstrOverloading c1 = new ConstrOverloading(1,"Pradeep");
		ConstrOverloading c2 = new ConstrOverloading(2,"Anil",30);
		
		c1.display();
		c2.display();

	}

}
