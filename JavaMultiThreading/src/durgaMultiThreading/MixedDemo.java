package durgaMultiThreading;
public class MixedDemo {
        public static void main(String[] args)
        {
		MyMixed m = new MyMixed();
		Thread t =new Thread(m);
		t.start();
		System.out.println("Parent Thread");
		}
}
