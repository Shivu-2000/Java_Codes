//use of this statement
class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.age=age;
		this.name=name;
	}
	void talk()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Exp17This
{
	public static void main(String arg[])
	{
		Person p = new Person("SHIVANI",23);
		p.talk();
	}
}
	