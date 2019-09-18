package accessModifierPackage2;
import accessModifierPackage1.*;


public class MyDefault {

	public static void main(String[] args) {
Default1 p1=new Default1();  
//System.out.println(p1.data);//Compile Time Error as data is declared default in Default1 class of accessModifierPackage1 package
//p1.msg();//Compile Time Error as method msg is declared default in Default1 class of accessModifierPackage1 package

	}

}
