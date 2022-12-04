//Program for try, catch and finally
class Exp30TryA
{
	public static void main(String arg[])
	{
		try
		{
			System.out.println("Open the file...");
			int l = arg.length;
			int c=45/l;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("File closed...");
		}
	}	
}			
			
		
