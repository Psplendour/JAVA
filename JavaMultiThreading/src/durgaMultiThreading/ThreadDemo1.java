package durgaMultiThreading;
//Overloading of run method
public class ThreadDemo1 {
        public static void main(String[] args) {
		MyThread1 t = new MyThread1();//Thread Initiation
		t.start(); //Starting Of a Thread
		t.run(10); //run method call by main thread
	}
}
