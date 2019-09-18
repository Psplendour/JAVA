package durgaMultiThreading;
public class JoinThread extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Thread Child");
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e){}
        }
}
}