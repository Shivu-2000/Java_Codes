//Static polymorphism private method overloading

class Demo 
{
	private void sum(int x, int y)
	{
		System.out.println("X+Y :"+(x+y));
	}
	private void sum(int x, int y, int z)
	{
		System.out.println("X+Y+Z :"+(x+y+z));
	}
	Demo()
	{
		sum(10,20);
		sum(10,20,30);
	}
}
class Exp24bStaticPrivateOverloading
{
	public static void main(String arg[])
	{
		Demo d = new Demo();
	}
}

