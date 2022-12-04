//Dynamic polymorphism method overloading

class Sample
{
	void sum(int x, int y)
	{
		System.out.println("X+Y :"+(x+y));
	}
	void sum(int x, int y, int z)
	{
		System.out.println("X+Y+Z :"+(x+y+z));
	}
}
class Exp23aDynamicOverloading
{
	public static void main(String arg[])
	{
		Sample d = new Sample();
		d.sum(10,20);
		d.sum(10,20,30);
	}
}

