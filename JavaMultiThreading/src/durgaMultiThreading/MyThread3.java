package durgaMultiThreading;
//Overriding of start method
public class MyThread3 extends Thread 
{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
