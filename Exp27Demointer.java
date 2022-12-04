//Program to implement Interface

interface Myinter
{
	void connect();
	void disconnect();
}

class OracleDB implements Myinter
{
	public void connect()
	{
		System.out.println("Connection Set");
	}
	public void disconnect()
	{
		System.out.println("Connection Distorted");
	}
}

class SybaseDB implements Myinter
{
	public void connect()
	{
		System.out.println("Connection Set");
	}
	public void disconnect()
	{
		System.out.println("Connection Distorted");
	}
}

class Exp27Demointer
{
	public static void main(String arg[]) throws Exception
	{
		Class c = Class.forName(arg[0]);
		Myinter mi = (Myinter)c.newInstance();
		mi.connect();
		mi.disconnect();
	}
}