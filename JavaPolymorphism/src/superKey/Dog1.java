package superKey;
//super is used to refer immediate parent class instance variable.
public class Dog1 extends Animal1 {
	String color="black";  
	
	void printColor()
	{  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  

}
