package durgaMultiThreading;
//Overloading of run method
public class MyThread1 extends Thread {
    public void run()
	{
		System.out.println("No Argument run method");
	}
    
    public void run(int i)
	{
		System.out.println("Int Argument run method");
	}
}
