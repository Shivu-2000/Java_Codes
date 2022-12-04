//Program to use user defined package
import mypackage.*;
class Exp29PackageUse
{
	public static void main(String arg[])
	{
		Exp29PackageAdd a = new Exp29PackageAdd(10,30);
		Exp29PackageSub s = new Exp29PackageSub(80,65);
		a.show();	
		s.show();
	}
}