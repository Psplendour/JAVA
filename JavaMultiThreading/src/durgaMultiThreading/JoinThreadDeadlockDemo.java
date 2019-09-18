package durgaMultiThreading;
public class JoinThreadDeadlockDemo {
public static void main(String[] args) throws InterruptedException {
	    JoinThreadDeadlock.mt = Thread.currentThread();
		
	    JoinThreadDeadlock t = new JoinThreadDeadlock();
		t.start();
		t.join();
	    {
			for(int i=0;i<=5;i++)
			{
			System.out.println("Thread Parent");
			Thread.sleep(2000);
			}
	    }
	}
}
