package methodOveridding;
//Example of method overriding
public class Bike extends Vehicle{
          void run()//defining the same method as in the parent class 
		  {
			  System.out.println("Bike is running safely");
		  }  
         
              public static void main(String args[]){  
        	  Bike obj = new Bike();//creating object  
        	  obj.run();//calling method  
        	  }  
	}


