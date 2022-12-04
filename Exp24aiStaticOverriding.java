//Static polymorphism method overriding

class ONE
{
	static void show()
	{
		System.out.println("In parent class:");
		System.out.println("ONE");
	}
}
class TWO extends ONE
{
	static void show()
	{
		System.out.println("In Child class:");
		System.out.println("TWO");
	}
}
class Exp24aiStaticOverriding
{
	public static void main(String arg[])
	{
		TWO d = new TWO();
		d.show();
		d.show();
		//OR
		ONE o = new TWO();
		o.show();
		o.show();
	}
}

