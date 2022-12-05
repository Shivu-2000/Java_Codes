//Multi thred acting on a single object
class Reserve implements Runnable
{
	int avail=1;
	int wait;
	Reserve(int w)
	{
		wait=w;
	}
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Avaiable:"+avail);
			if(avail>=wait)		
			{
				String name=Thread.currentThread().getName();
				System.out.println(wait+" Berth reserved for: "+name);
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
}

class Exp37_2T2Obj	
{
	public static void main(String arg[])
	{
		Reserve r=new Reserve(1);
		Thread t1=new Thread(r);
		Thread t2 = new Thread(r);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}	
}