package durgaMultiThreading;
public class ThreadDemo {
        public static void main(String[] args) {
		MyThread t = new MyThread();//Thread Initiation
		t.start(); //Starting Of a Thread
		{
			for(int i=0;i<=5;i++)
			System.out.println("Thread Parent");
		}
	}
}
