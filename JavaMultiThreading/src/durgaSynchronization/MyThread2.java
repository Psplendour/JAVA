package durgaSynchronization;
public class MyThread2 extends Thread 
{
	Display2 d;
	String name;
	MyThread2(Display2 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
