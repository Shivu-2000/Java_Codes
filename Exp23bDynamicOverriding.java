//Dynamic polymorphism method overriding

class ONE
{
	void show()
	{
		System.out.println("In parent class:");
		System.out.println("ONE");
	}
}
class TWO extends ONE
{
	void show()
	{
		System.out.println("In Child class:");
		System.out.println("TWO");
	}
}
class Exp23bDynamicOverriding
{
	public static void main(String arg[])
	{
		TWO d = new TWO();
		d.show();
		d.show();
	}
}

