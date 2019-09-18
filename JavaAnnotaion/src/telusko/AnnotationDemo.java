package telusko;

public class AnnotationDemo {
	public class A 
	   {
		public void showMyDataBaseFromLastyearDatabase()
			{
				System.out.println("In A");
			}  
		}
		
		    public class B extends A 
		    {
	        public void showMyDataBaseFromLastyearDataBase()
			{
				System.out.println("In B");
			}
	        }

	public static void main(String[] args) {
		AnnotationDemo an = new AnnotationDemo();
		
		B b = an.new B();
		b.showMyDataBaseFromLastyearDatabase();

	}

}
