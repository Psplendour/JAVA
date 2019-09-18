package methodOverloading;

public class MethOverwithTypePromoMain {

	public static void main(String[] args) 
	    {
		MethOverwithTypePromo m1=new MethOverwithTypePromo();
		m1.sum(20,20);//now second int literal will be promoted to long  
		m1.sum(20,20,20);
		}

}

//here in the first method calling we are giving two formal int arugument 
