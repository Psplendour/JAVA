package durgaSynchronization;
public class MyThread extends Thread 
{
	Display1 d;
	String name;
	MyThread(Display1 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
