package durgaMultiThreading;

public class InterruptThread extends Thread {
	 public void run()
		{
	    	try{
				for(int i=0;i<=5;i++)
				{
				System.out.println("I am a Lazy Thread");
				Thread.sleep(5000);
				}
	    	    }
				catch (InterruptedException e) 
				{
					System.out.println("I got Interrupted");
				}
			}
		}

