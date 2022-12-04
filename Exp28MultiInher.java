//Program for multiple inhritance using Interface
interface Father
{
	int p=1200;
	void show();
}
interface Mother
{
	int p=2300;
	void show();
}
class Child implements Mother,  Father
{
/*	public void show1()
	{
		System.out.println("Mother Property:"+Mother.p);
		System.out.println("Father Property:"+Father.p);
	}*/
	public void show()
	{
		System.out.println("Child Property="+(Mother.p+Father.p));
	}
}
class Exp28MultiInher
{
	public static void main(String arg[])
	{
		Child c = new Child();
		c.show();
		//c.show2();
	}
}
	