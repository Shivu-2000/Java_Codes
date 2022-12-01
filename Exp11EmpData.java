//Program to enter employee data from user and display it
import java.util.*;
class Exp11EmpData
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String ename=sc.nextLine();
		System.out.println("Enter Employee Id: ");
		int eid=sc.nextInt();
		System.out.println("Enter Employee Gender: ");
		char egender=sc.next().charAt(0);
		System.out.println("Enter Employee Salary: ");
		float esalary=sc.nextFloat();
		System.out.println("********Employee data********");
		System.out.println("Employee name: "+ename);
		System.out.println("Employee id: "+eid);
		System.out.println("Employee gender: "+egender);
		System.out.println("Employee salary: "+esalary);
		System.out.println("*****************************");
	}
}