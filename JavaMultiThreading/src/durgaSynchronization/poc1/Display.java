package durgaSynchronization.poc1;
public class Display {
	//public void wish(String name) 
	public synchronized void displayn()
	{
		for(int i=1 ;i<=5;i++) 
		{
			System.out.print(i);
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}
	}
	public synchronized void displayc()
	{
		for(int i=65 ;i<=70;i++) 
		{
			System.out.print((char)i);
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}
		}
	}
