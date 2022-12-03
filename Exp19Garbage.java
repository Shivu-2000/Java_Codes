//Program to show use of Garbage collector and finalize method

class Test
{
	Test()
	{
		System.out.println("Object Created");
	}
	protected void finalize()
	{
		System.out.println("Object Destroyed");
	}
}
class Exp19Garbage
{
	public static void main(String arg[])
	{
		Test t=new Test();
		t=null;
		Test t1=new Test();
		Test t2=new Test();
		t1=t2;
		new Test();
		System.gc();
	}
}
