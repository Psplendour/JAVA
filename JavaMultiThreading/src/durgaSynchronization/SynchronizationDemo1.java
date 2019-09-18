package durgaSynchronization;
public class SynchronizationDemo1 {
        public static void main(String[] args) {
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread t1 = new MyThread(d1,"Dhoni");
		MyThread t2 = new MyThread(d2,"Raina");
		t1.start();
		t2.start();
}
}
