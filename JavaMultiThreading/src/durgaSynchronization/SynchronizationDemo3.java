package durgaSynchronization;
public class SynchronizationDemo3 {
        public static void main(String[] args) {
		Display2 d = new Display2();
		MyThread2 t1 = new MyThread2(d,"Dhoni");
		MyThread2 t2 = new MyThread2(d,"Raina");
		t1.start();
		t2.start();
}
}
 