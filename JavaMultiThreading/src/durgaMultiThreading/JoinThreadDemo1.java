package durgaMultiThreading;
public class JoinThreadDemo1 {
public static void main(String[] args) throws InterruptedException {
		JoinThread1.mt = Thread.currentThread();
		
		JoinThread1 t = new JoinThread1();
		t.start();
	    {
			for(int i=0;i<=5;i++)
			{
			System.out.println("Thread Parent");
			Thread.sleep(2000);
			}
	    }
	}
}
