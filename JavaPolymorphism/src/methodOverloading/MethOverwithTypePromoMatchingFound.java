package methodOverloading;

public class MethOverwithTypePromoMatchingFound {
	  void sum(int a,int b)
	  {
		  System.out.println("int arg method invoked");
	  }  
	  
	  void sum(long a,long b)
	  {
		  System.out.println("long arg method invoked");
	  }  
}
//If there are matching type arguments in the method, type promotion is not performed.