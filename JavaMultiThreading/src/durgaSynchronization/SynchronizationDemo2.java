package durgaSynchronization;
public class SynchronizationDemo2 {
        public static void main(String[] args) {
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		MyThread2 t1 = new MyThread2(d1,"Dhoni");
		MyThread2 t2 = new MyThread2(d2,"Raina");
		t1.start();
		t2.start();
}
}
