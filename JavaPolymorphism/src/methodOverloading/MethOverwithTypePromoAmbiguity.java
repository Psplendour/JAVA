package methodOverloading;
//Example of Method Overloading with Type Promotion in case of ambiguity
public class MethOverwithTypePromoAmbiguity {
	  void sum(int a,long b)
	  {
		  System.out.println("a method invoked");
	  }  
	  void sum(long a,int b)
	  {
	   System.out.println("b method invoked");
	  } 
}

//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.