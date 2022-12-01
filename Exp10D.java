/* 	* * * *
	*     *
 	*     *
	* * * *       */
class Exp10D
{
	public static void main(String a[])
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{	
				if(i==0 || j==0 || i==3 || j==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
			