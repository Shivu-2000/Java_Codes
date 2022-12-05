//program to create a client that send and receive data
import java.io.*;
import java.net.*;
class Exp36_Client2
{
	public static void main(String main[]) throws IOException
	{
		Socket s= new Socket("localhost",888);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		String str1, str2;
		while(!(str1=kb.readLine()).equals("null"))
		{	
			dos.writeBytes(str1+"\n");
			str2= kb.readLine();
			System.out.println(str2);
		}
		dos.close();
		kb.close();
		br.close();
		s.close();
	}
}