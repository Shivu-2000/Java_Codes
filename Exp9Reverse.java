//Program to reverse a num
import java.lang.*;
class Exp9Reverse
{
	public static void main(String arg[])
	{
		int a=123;
		int r=0,n;
		System.out.println("Original Number is: "+a);			
		while(a>0)
		{
			n=a%10;	
			r=r*10+n;	
			a=a/10;
		}
		System.out.println("Reverse Number is: "+r);			
	}
}