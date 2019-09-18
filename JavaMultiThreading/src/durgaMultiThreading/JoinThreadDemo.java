package durgaMultiThreading;
public class JoinThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		JoinThread t = new JoinThread();
		t.start();
		t.join(); //Line 1
		//t.join(6000);//line 2
		{
			for(int i=0;i<=5;i++)
			System.out.println("Thread Parent");
			Thread.sleep(5000);
	    }
	}
}
