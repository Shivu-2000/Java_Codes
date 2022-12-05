//Multi thread acting on a multiple objects
class Pvr implements Runnable
{
	String str;
	Pvr(String w)
	{
		str=w;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(str+" "+i);
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)	
			{
				System.out.println(e);
			}
		}	
	}
}
	

class Exp38_2T1Obj	
{
	public static void main(String arg[])
	{
		Pvr r1=new Pvr("Cut Ticket");
		Pvr r2=new Pvr("Show Ticket");
		Thread t1=new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}	
}