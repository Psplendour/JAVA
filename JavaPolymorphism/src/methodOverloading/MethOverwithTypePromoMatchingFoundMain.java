package methodOverloading;

public class MethOverwithTypePromoMatchingFoundMain {

	public static void main(String[] args)
	{
		MethOverwithTypePromoMatchingFound m1=new MethOverwithTypePromoMatchingFound();
		m1.sum(20,20);//now int arg sum() method gets invoked
    }
}
//If there are matching type arguments in the method, type promotion is not performed.
