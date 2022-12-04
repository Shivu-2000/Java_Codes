//Program to implement abstract method
class Car
{
	int regno;
	Car(int x)
	{
		regno=x;
	}
	void opentank()
	{
		System.out.println("Fill the tank");
	}
	abstract void steering();
	abstract void brake();
}
class Maruti extends Car
{
	Maruti(int r)
	{
		super(r);
		System.out.println("Maruti Car Regestration num:"+regno);
	}
	void steering()
	{
		System.out.println("Ordinary Streering");
	}
	void brake()
	{
		System.out.println("Ordinary Brake");
	}
}
class Santro extends Car
{
	Santro (int r)
	{
		super(r);
		System.out.println("Santro Car Regestration num:"+regno);
	}
	void steering()
	{
		System.out.println("Power Streering");
	}
	void brake()
	{
		System.out.println("Power Brake");
	}
}
class Exp25AbsMethd
{
	public static void main(String argd[])
	{
		Maruti m = new Maruti(031325);
		m.opentank();
		m.steering();
		m.brake();

		Santro s = new Santro(313250);
		s.opentank();
		s.steering();
		s.brake();
	}
}