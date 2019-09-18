package interfaceInheritance;

public class MyShowPrint implements Showable {

	@Override
	public void print() 
	    {
		System.out.println("Hello");
		}

	@Override
	public void show() 
	{
		System.out.println("Welcome");
	}
	
  public static void main(String[] args) {
	  MyShowPrint sp = new MyShowPrint();
	  
	  sp.print();
	  sp.show();

	}

}
