//Program to illustrate Instant variables and methods

class Test
{
	int a,b;
	Test()
	{
		a=10;
		b=20;
	}
	int sum()
	{
		return(a+b);
	}
}
class Exp15Instant
{
	public static void main(String arg[])
	{
		Test t=new Test();
		int z=t.sum();
		System.out.print(z);
	}
}