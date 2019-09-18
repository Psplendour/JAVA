package durgaMultiThreading;

public class InterruptThreadDemo1 {

	public static void main(String[] args) {
		InterruptThread1 t = new InterruptThread1();
		t.start();
		t.interrupt();//line 1
		System.out.println("End of main Thread");
}
}
