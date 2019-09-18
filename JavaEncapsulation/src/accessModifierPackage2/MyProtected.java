package accessModifierPackage2;
import accessModifierPackage1.*;
//The protected access modifier is accessible within package and outside the package but through inheritance only.
public class MyProtected extends Protected1 {
	
	public static void main(String[] args) {
		 MyProtected p = new MyProtected();
		 System.out.println(p.data);
		 p.msg();
		 
	}
}
