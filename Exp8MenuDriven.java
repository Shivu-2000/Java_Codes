//Program for menu driven
import java.lang.*;
import java.util.Scanner;
class Exp8MenuDriven
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter choice: ");
		int c=sc.nextInt();
		switch(c)
		{
			case 1:
				System.out.println(a+" + "+b+" = "+(a+b));		
				break;
			case 2:
				System.out.println(a+" - "+b+" = "+(a-b));		
				break;
			case 3:
				System.out.println(a+" x "+b+" = "+(a*b));		
				break;
			case 4:
				System.out.println(a+" / "+b+" = "+(a/b));		
				break;
			default:
				System.out.println("Enter valid choice");
				break;
		}

	}
}