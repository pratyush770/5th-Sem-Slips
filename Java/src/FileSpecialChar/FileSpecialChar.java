import java.io.*;
class FileSpecialChar
{
	public static void main(String []args) throws Exception
	{
		FileReader fr = new FileReader(args[0]);
		int data = 0;
	 	while(data!=-1)
		{
			data = fr.read();
			char ch = (char)data;
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
				;
			else if(ch>='0' && ch<='9')
				;
			else
				System.out.print(ch + " "); 
		}
	}
}