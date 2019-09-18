package accessModifierPackage1;
//Simple example of private access modifier
public class MyPriavate {

	public static void main(String[] args) {
		   Private1 p1=new Private1();  
		   System.out.println(p1.data);//Compile Time Error When data is declared private in Private1 
		   p1.msg();//Compile Time Error When method msg is declared private in Private1

	}

}
