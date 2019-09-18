package mapByDurga;
import java.util.*;
public class WeakHashMapDemo {

	public static void main(String[] args) throws Exception 
	{
		HashMap m=new HashMap();
		//WeakHashMap m =new WeakHashMap();
		Temp t =new Temp();
		m.put(t, "Durga");
		
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}
