//Static polymorphism final method overloading

class Demo 
{
	final void sum(int x, int y)
	{
		System.out.println("X+Y :"+(x+y));
	}
	final void sum(int x, int y, int z)
	{
		System.out.println("X+Y+Z :"+(x+y+z));
	}
}
class Exp24cStaticFinalOverloading
{
	public static void main(String arg[])
	{
		Demo d = new Demo();
		d.sum(10,20);
		d.sum(10,20,30);
	}
}

