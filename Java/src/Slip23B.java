import java.io.*;
class Slip23B
{
	public static void main(String [] args) throws Exception
	{
		File f = new File(args[0]);
		if(f.isHidden())
		{
			System.out.println("File is hidden");
		}
		else
		{
			System.out.println("Path is : " + f.getAbsolutePath());
		}
	}
}