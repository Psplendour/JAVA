package accessModifierPackage1;
//The protected access modifier is accessible within package and outside the package but through inheritance only.
public class MyProtected {
	
	public static void main(String[] args) {
	 Protected1 p = new Protected1();
	 System.out.println(p.data);
	 p.msg();
	}	  
}
