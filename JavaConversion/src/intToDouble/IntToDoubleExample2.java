package intToDouble;

public class IntToDoubleExample2 {

	public static void main(String[] args) {
		long i=100;
		
	    //char c='a';
	    //String s ="Pradeep"; //Getting the error java.lang.NumberFormatException
		Double d= new Double(i);//first way  
		Double d2=Double.valueOf(i);//second way  
		
		System.out.println(d);  
		System.out.println(d2);
		
		

	}

}
