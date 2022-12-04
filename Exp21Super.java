//Program to show use of super keyword in inheritance
class Parent
{
	int x=10;
	void show1()
	{
		System.out.println("In Parent class");
		System.out.println("X:"+x);
	}
}
class Child extends Parent
{
	int x=20;
	void show1()
	{	
		super.show1();
		System.out.println("In child class");
		System.out.println("Child X:"+x);
		System.out.println("Parent X:"+(super.x));
	}
}
class Exp21Super
{
	public static void main(String arg[])
	{
		Child c = new Child();
		c.show1();
	}
}