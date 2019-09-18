package durgaMultiThreading;
public class GetSetThreadNameDemo {
        public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		MyGetSetThreadName m =new MyGetSetThreadName();
		System.out.println(m.getName());
		Thread.currentThread().setName("Pawan Kalyan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
}
}
