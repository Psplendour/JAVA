package durgaSynchronization;
public class Display3 {
	//public void wish(String name) 
	public synchronized void wish(String name)
	{
		;;;;;;;;;;//One lakh of code
		synchronized(this)
		{
		for(int i=1 ;i<=5;i++) 
		{
			System.out.print("Good Morning:");
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name);
			}
		}
	}
	     ;;;;;;;;;;//One lakh line of code
	}
