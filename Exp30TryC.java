//Program for Throws #### Re-throw statement
import java.io.*;
/*class ThrowDemo
{
	void demo()
	{
		try
		{
			String s="Hello";
			char c=s.charAt(9);
		}
		catch(Exception e)
		{
			System.out.println(e);			
			throw e;
		}
	}
}*/
	
class Exp30TryC
{
	public static void main(String arg[]) throws IOException
	{
		/* ThrowDemo t = new ThrowDemo();
		try
		{
			System.out.println("File Open....");
			t.demo();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
		}
		finally
		{
			System.out.println("File closed...");
		}*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b =Integer.parseInt(br.readLine());
		System.out.println("Sum of a+b is:"+(a+b));
	}	
}			
			
		
