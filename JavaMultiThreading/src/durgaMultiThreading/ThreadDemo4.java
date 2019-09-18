package durgaMultiThreading;
//start method with super key word
public class ThreadDemo4 {
        public static void main(String[] args) {
		MyThread4 t = new MyThread4();//Thread Initiation
		t.start(); //Starting Of a Thread
		{
			System.out.println("Main Method");
		}
	}
}
