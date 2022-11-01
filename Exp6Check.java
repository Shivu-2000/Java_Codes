//Java program for chceking a given num is +ve, -ve or 0
import java.lang.*;
class Exp6Check
{
	public static void main(String arg[])
	{
		
		System.out.println("Number check by simple if: ");
		int n=8;
		int m=-9;
		if(n==0)
			System.out.println("The number is zero");
		
		if(n>0)
			System.out.println("The number is positive");
		
		if(n<0)
			System.out.println("The number is negative");
		

		System.out.println("Number check by else if: ");
		
		if(m==0)
			System.out.println("The number is zero");
		
		else if(m>0)
			System.out.println("The number is positive");
		
		else
			System.out.println("The number is negative");
	}
}