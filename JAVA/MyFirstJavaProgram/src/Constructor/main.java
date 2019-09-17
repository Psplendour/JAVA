package Constructor;
//Class Constructor in Java
public class main {
	
	public static void main(String[] args) 
	{
		Volume V1= new Volume();
		System.out.println(V1.getVolume());	
		
		Volume V2=new Volume(10,20,30);
		System.out.println(V2.getVolume());
		
	}

}
