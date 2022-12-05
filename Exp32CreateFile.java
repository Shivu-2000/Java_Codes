//Program to create a file using byte writer
import java.io.*;
class Exp32CreateFile
{
	public static void main(String arg[]) throws IOException
	{
		DataInputStream dis= new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("myfile.txt");
		char ch;
		System.out.println("Enter @ to terminate");
		while((ch=(char)dis.read())!='@')
			fout.write(ch);
		fout.close();
	}
}