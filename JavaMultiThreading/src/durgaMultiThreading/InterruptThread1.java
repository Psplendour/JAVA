package durgaMultiThreading;

public class InterruptThread1 extends Thread {
	 public void run()
		{
	    	    for(int i=0;i<=5000;i++)
				{
				System.out.println("I am a Lazy Thread "+i);
				}
				System.out.println("I am entering into the sleeping state");
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					System.out.println("I got interupt");
				}
			}
		}


