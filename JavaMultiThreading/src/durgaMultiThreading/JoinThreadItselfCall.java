package durgaMultiThreading;
public class JoinThreadItselfCall {
    public static void main(String[] args) throws InterruptedException 
	{
		Thread.currentThread().join();
		System.out.println("Parent Thread");
	}
}

