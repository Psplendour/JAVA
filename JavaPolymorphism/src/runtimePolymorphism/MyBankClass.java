package runtimePolymorphism;
//Java Runtime Polymorphism Example: Bank
public class MyBankClass {

	public static void main(String[] args) 
	    {
		Bank a;
		a=new SBI();    //upcasting  Referece of variable of Parent Class -->Object of Child class
		System.out.println("SBI Rate of Interest: "+a.getRateOfInterest());  
	    a=new ICICI();  //upcasting
	    System.out.println("ICICI Rate of Interest: "+a.getRateOfInterest());  
	    a=new AXIS();   //upcasting
	    System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
		}  
        }


