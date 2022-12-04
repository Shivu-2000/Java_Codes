//Program for throw statement
class ThrowDemo
{
	static void demo()
	{
		
		try
		{
			System.out.println("Inside demo");
			throw new NullPointerException();
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);			
		}
	}
}
	
class Exp30TryB
{
	public static void main(String arg[])
	{
		ThrowDemo.demo();
	}	
}			
			
		
