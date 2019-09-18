package multipleInheritance;
//Multiple inheritance in Java by interface
public class MyShowPrint implements ShowAble,PrintAble{

	public static void main(String[] args) {
		MyShowPrint sp= new MyShowPrint();
		sp.showable();
		sp.printable();
		}


	public void printable() //Method Override of base class PrintAble
	{
		System.out.println("Hello");
		
	}
    public void showable()  //Method Override from base class ShowAble
    {
		System.out.println("Welcome");
		
	}

}
