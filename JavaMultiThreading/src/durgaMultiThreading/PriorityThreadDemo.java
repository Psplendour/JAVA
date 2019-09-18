package durgaMultiThreading;
public class PriorityThreadDemo {
        public static void main(String[] args) {
		int max=Thread.MAX_PRIORITY;
		int min=Thread.MIN_PRIORITY;
		int norm= Thread.NORM_PRIORITY;
		System.out.println("Max Priority "+max+": Min Priority "+min+": Default Priority "+norm);
		
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(17); //java.lang.IllegalArgumentException
		Thread.currentThread().setPriority(7);
		
		PriorityThread p= new PriorityThread();
        System.out.println(p.getPriority());

	}
}
