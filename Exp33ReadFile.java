//Program to Read a file using File Reader
import java.io.*;
class Exp33ReadFile
{
	public static void main(String arg[]) throws IOException
	{
		FileInputStream fin= new FileInputStream("myfile.txt");
		System.out.println("File Content");
		int ch;
		while((ch=fin.read())!=-1)
			System.out.print((char)ch);
		fin.close();
	}
}