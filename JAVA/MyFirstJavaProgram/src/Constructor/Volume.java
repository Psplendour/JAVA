package Constructor;
//Class Constructor in Java
public class Volume {
	int l;
	int w;
	int h;
	
	public int getVolume()
	{
		return(l*w*h);
	}
	
	Volume()
	{
		l=10;
		w=10;
		h=10;
	}
	
	Volume(int l1,int w1,int h1)
	{
		l=l1;
		w=w1;
		h=h1;
	}
	}
