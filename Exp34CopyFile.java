//Program to copy the content of one file to another
import java.io.*;
class Exp34CopyFile
{
	public static void main(String arg[]) throws IOException
	{
		FileInputStream fin= new FileInputStream("myfile.txt");
		FileOutputStream fout=new FileOutputStream("myfile1.txt");
		int ch;
		while((ch=fin.read())!=-1)
			fout.write((char)ch);
		System.out.println("Content Copied");
		fin.close();
		fout.close();
	}
}