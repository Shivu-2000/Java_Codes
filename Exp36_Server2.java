//program to create a server that send and receive data
import java.io.*;
import java.net.*;
class Exp36_Server2
{
	public static void main(String main[]) throws IOException
	{
		ServerSocket ss= new ServerSocket(888);
		Socket s= ss.accept();
		System.out.println("Connection established");
		PrintStream ps = new PrintStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str1, str2;
			while((str1=br.readLine())!=null)
			{	
				System.out.println(str1);
				str2= kb.readLine();
				ps.println(str2);
			}
			ps.close();
			kb.close();
			br.close();
			ss.close();
			s.close();
			System.exit(0);	
		}
	}
}