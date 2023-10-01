import java.io.*;
class FilePractice
{
	public static void main(String [] args) throws Exception
	{
		File f = new File(args [0]);
		if(f.exists())
		{
			System.out.println("File Found");
		}
		if(f.isFile())
		{
			System.out.println("The length of the file is : " + f.length());
		}
		else if(f.isDirectory())
		{
			String s[] = f.list();
			for(int i =0 ; i<=s.length;i++)
			System.out.println("\t" + s[i]);
		}
		else
			System.out.println("File not found");
	}
}