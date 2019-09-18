package stringConcatenation;
//String Concatenation by + (string concatenation) operator
public class TestStringConcatenation1 {

	public static void main(String[] args) 
	{
		   String s="Sachin"+" Tendulkar";  
		   //String s=(new StringBuilder()).append("Sachin").append(" Tendulkar").toString(); 
		   System.out.println(s);//Sachin Tendulkar
    }

}

/*
The Java compiler transforms above code to this:
String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString()
*/