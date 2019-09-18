package durgaMultiThreading;
public class YieldDemo {
        public static void main(String[] args) {
		Yield t = new Yield();
		t.start();
		{
			for(int i=0;i<=5;i++)
			System.out.println("Thread Main");
		}
	}
}
