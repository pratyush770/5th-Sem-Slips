import java.io.*;
class Slip5A
{
	public static void main(String [] args) throws Exception
	{
		File f;
		for(int i = 0; i<args.length;i++)
		{
			f = new File(args[i]);
			if(f.exists())
			{
				if(args[i].endsWith(".txt"))
				{
					f.delete();
					System.out.println("\t File deleted Successfully " + args[i]);
				}
				else
				{
					System.out.println("\t Txt file not found...The details are as follows :");
					System.out.println("\t The name of the file is : " + f.getName());
					System.out.println("\t The location of the file is : " + f.getPath());
					System.out.println("\t The size of the file is : " + f.length());
				}
			}
			else
				System.out.println("\t File not found " + args[i]);
				System.out.println("\t --------------------------------------------------");
		}
	}
}