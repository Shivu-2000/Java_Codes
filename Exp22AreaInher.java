//Demonstrate area of rectangle and circle
class Shape
{
	int length,breadth,radius;
}
class Rectangle extends Shape
{
	int area;
	void area_()
	{
		area=length*breadth;
		System.out.println("Area of rectangle is :"+area);
	}
}
class Circle extends Shape
{
	int area;
	void area_()
	{
		System.out.println("Area of square is :"+(3.14*radius*radius));
	}
}
class Exp22AreaInher
{
	public static void main(String arg[])
	{
		Rectangle obj=new Rectangle();
		obj.length=10;
		obj.breadth=20;
		obj.area_();
		Circle obj1=new Circle();
		obj1.radius=5;
		obj1.area_();
	}
}