package durgaMultiThreading;
public class JoinThreadDeadlock extends Thread{
static Thread mt;
	public void run()
	{
		try 
		{
			mt.join();
			//mt.join(6000);
		} catch (InterruptedException e) {}
		
		for(int i=0;i<=5;i++)
		{
		System.out.println("Thread Child");
        }
	}
}