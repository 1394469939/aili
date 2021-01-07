package ×÷ÒµÊ®;
import java.io.*;
public class e2 {
	public static void main(String[] args)throws IOException
	{
		File in=new File("/Users/lihaji/Desktop/in.txt");
		File out=new File("/Users/lihaji/Desktop/out.txt");
		try
		{
			FileInputStream cin=new FileInputStream(in);
			FileOutputStream cout=new FileOutputStream(out);
			int a;
			while((a=cin.read())!=-1)
			{
				cout.write((char)a);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}
