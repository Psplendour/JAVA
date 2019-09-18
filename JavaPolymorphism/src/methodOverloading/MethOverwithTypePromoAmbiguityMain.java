package methodOverloading;
//Example of Method Overloading with Type Promotion in case of ambiguity
public class MethOverwithTypePromoAmbiguityMain {

	public static void main(String[] args) {
		MethOverwithTypePromoAmbiguity m1 =new MethOverwithTypePromoAmbiguity();
		//m1.sum(20,20);//The method sum(int, long) is ambiguous for the type MethOverwithTypePromoAmbiguity
}
}

//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.