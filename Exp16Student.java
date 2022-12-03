//Program to make student class and print 2 object details

class Student
{
	int rollno;
	String name;
	void setname(String s)
	{
		name=s;
	}
	void setrollno(int r)
	{
		rollno=r;
	}
	String setname()
	{
		return name;
	}
	int setrollno()
	{
		return rollno;
	}
}
class Exp16Student
{
	public static void main(String arg[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.setname("Shivani Gupta");
		s1.setrollno(22);
		s2.setname("Vishal Ohal");
		s2.setrollno(22);
		System.out.println("Object 1:");
		System.out.println("Name: "+s1.setname());
		System.out.println("Roll no: "+s1.setrollno());
		System.out.println("Object 2:");
		System.out.println("Name: "+s2.setname());
		System.out.println("Roll no: "+s2.setrollno());
	}
}