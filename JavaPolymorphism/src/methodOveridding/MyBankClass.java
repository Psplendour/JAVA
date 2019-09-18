package methodOveridding;

public class MyBankClass {

	public static void main(String[] args) 
	    {
//      Also See this example in runtime polymorhism
//		Bank s1=new SBI();    upcasting  Referece of variable of Parent Class -->Object of Child class
//		Bank i1=new ICICI();  upcasting
//		Bank a1=new AXIS();   upcasting
		
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();
	
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
		}  

	}


