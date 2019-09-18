package accessModifierPackage2;
import accessModifierPackage1.Public;
//The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
//No need to inherit the base class in other package
public class MyPublic {

	public static void main(String[] args) {
		 Public p = new Public();
		 System.out.println(p.data);
		 p.msg();

	}

}
