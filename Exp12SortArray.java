//Program to sort the array
import java.util.*;
class Exp12SortArray
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,t,n;
		System.out.println("Enter Array size: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Unsorted Array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.print("Sorted Array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}