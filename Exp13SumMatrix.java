//Program to sum two matrix

import java.util.*;
class Exp13SumMatrix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2,i,j;
		System.out.println("Enter number of Matrix1 rows: ");
		r1=sc.nextInt();
		System.out.println("Enter number of Matrix1 columns: ");
		c1=sc.nextInt();
		System.out.println("Enter number of Matrix2 rows: ");
		r2=sc.nextInt();
		System.out.println("Enter number of Matrix2 columns: ");
		c2=sc.nextInt();
		if(r1==r2 && c1==c2)
		{
			int a1[][]=new int[r1][c1];
			int a2[][]=new int[r2][c2];
			System.out.println("Enter Matrix1: ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{	
					System.out.print("Enter element: ");
					a1[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("Enter Matrix2: ");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print("Enter element: ");	
					a2[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			int c[][]=new int[r1][c1];
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{	
					c[i][j]=a1[i][j]+a2[i][j];
				}
			}	
			System.out.println("Matrix1: ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{	
					System.out.print(a1[i][j]+ " ");
				}
				System.out.println();
			}
			System.out.println("Matrix2: ");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{	
					System.out.print(a2[i][j]+ " ");
				}
				System.out.println();
			}
			System.out.println("Sum of Matrix1 and Matrix2 is: ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{	
					System.out.print(c[i][j]+ " ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Sum not possible");
		}
	}
}