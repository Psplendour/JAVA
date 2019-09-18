package durgaMultiThreading;

public class InterruptThreadDemo {

	public static void main(String[] args) {
		InterruptThread t = new InterruptThread();
		t.start();
		t.interrupt();//line 1
		System.out.println("End of main Thread");
}
}
