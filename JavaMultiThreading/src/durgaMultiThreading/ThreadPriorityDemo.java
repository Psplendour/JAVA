package durgaMultiThreading;
public class ThreadPriorityDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setPriority(8);//Line 1
		t.start();
		{
			for(int i=0;i<=5;i++)
			System.out.println("Thread Main-1");
		}
		}
}
