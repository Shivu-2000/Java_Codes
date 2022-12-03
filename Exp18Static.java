//Program to show use of static variable
class Static
{
	static int c;
	static void Fun()
	{
		System.out.println("Value of c: "+c);
		c++;
	}
}
class Exp18Static
{
	public static void main(String arg[])
	{
		Static.c=0;
		Static s1=new Static();
		Static s2=new Static();
		Static s3=new Static();
		Static s4=new Static();
		s1.Fun();
		s2.Fun();
		s3.Fun();
		s4.Fun();
	}
}