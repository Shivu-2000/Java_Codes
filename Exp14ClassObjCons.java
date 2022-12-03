//Program for class object and constructor
class Person
{
	String name;
	int id;
	Person()
	{
		name="Default Constructor";
		id=22;
	}
	Person(String name, int id)
	{
		this.id=id;
		this.name=name;
	}
	void talk()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
}
class Exp14ClassObjCons
{
	public static void main(String arg[])
	{
		Person p1 = new Person();
		Person p2 = new Person("Parameterized Constructor",23);
		p1.talk();
		p2.talk();
	}
}
	