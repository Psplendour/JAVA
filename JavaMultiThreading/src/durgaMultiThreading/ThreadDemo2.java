package durgaMultiThreading;
//Overriding the run method but run method of Thread class 
//is called which return type is void
public class ThreadDemo2 {
        public static void main(String[] args) {
		MyThread2 t = new MyThread2();//Thread Initiation
		t.start(); //Starting Of a Thread
	}
}
