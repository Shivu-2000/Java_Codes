//Static polymorphism method overloading

class Sample
{
	static void sum(int x, int y)
	{
		System.out.println("X+Y :"+(x+y));
	}
	static void sum(int x, int y, int z)
	{
		System.out.println("X+Y+Z :"+(x+y+z));
	}
}

class Exp24aiiStaticOverloading
{
	public static void main(String arg[])
	{
		Sample d = new Sample();
		d.sum(10,20);
		d.sum(10,20,30);
		//OR
		Sample.sum(100,200);
		Sample.sum(10,20,300);
	}
}


