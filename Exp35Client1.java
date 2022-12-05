//Program to create a server that send the data to te client
import java.io.*;
import java.net.*;
class Exp35Client1
{
	public static void main(String arg[]) throws IOException
	{
		Socket s= new Socket("localhost",777);
		InputStream obj = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(obj));
		String str;
		while((str=br.readLine())!=null)
		System.out.println(str);
		br.close();
		s.close();
	}
}
		