package Inheritance;
////Inheritance in Java

//A base class is a class from which other classes are derived in an object-oriented programming language.
//A derived class is a class  derived from another existing class i.e base class.
//Polygon-->base class or super class 
//Rectangle & Triangle--> Derived class or child class
public class Triangle extends Polygon{
	 public double area(){
    	 return (height*weight)/2;
     }

}
