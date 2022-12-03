//Program to showw inheritance
class Parent
{
	int x=10;
	void show1()
	{
		System.out.println("X:"+x);
	}
}
class Child extends Parent
{
	int y=20;
	void show2()
	{
		System.out.println("Y:"+y);
	}
}
class Exp20Inheritance
{
	public static void main(String arg[])
	{
		Child c = new Child();
		c.show1();
		c.show2();
	}
}