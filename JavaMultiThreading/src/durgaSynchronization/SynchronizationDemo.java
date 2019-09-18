package durgaSynchronization;
public class SynchronizationDemo {
        public static void main(String[] args) {
		Display1 d = new Display1();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Raina");
		t1.start();
		t2.start();
}
}
