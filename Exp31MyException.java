//Program for USER defined exception
class Exp31MyException extends Exception
{
	static int accno[]={101,102,103};
	static String name[]={"Raja","Ravi","Ram"};
	static int bal[]={100,20005,3000};
	/*Exp31MyException ()
	{
	}*/
	Exp31MyException(String str)
	{
		super(str);
	}
	public static void main(String arg[])
	{
		try
		{
			System.out.println("Account number \t Name \t Balance");
			for(int i=0;i<3;i++)
			{
				System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
				if(bal[i]<1000)
				{
					Exp31MyException me=new Exp31MyException("Balanace is less than 1000");
					throw me;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		