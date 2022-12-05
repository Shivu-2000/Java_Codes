//Program to create a server that send the data to te client
import java.io.*;
import java.net.*;
class Exp35Server1
{
	public static void main(String arg[]) throws IOException
	{
		ServerSocket ss= new ServerSocket(777);
		Socket s = ss.accept();
		System.out.print("Connection set");
		OutputStream obj = s.getOutputStream();
		PrintStream ps=new  PrintStream(obj);
		String str="Hello Client";
		ps.println(str);
		ps.println("Bye");
		ps.close();
		ss.close();
		s.close();
	}
}
		