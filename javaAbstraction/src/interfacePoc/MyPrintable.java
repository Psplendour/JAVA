package interfacePoc;
//Java Interface Example
public class MyPrintable implements Printable {
	    public void print() 
	    {
		System.out.println("Hello");
		}
	
	public static void main(String[] args) {
		
		Printable p =new MyPrintable();
		p.print();
   
	}


	

}
