import java.io.*;
class Slip18A
{
	public static void main(String [] args) throws Exception
	{
		FileReader fr = new FileReader(args[0]);
		FileWriter fw = new FileWriter("xxx.txt");
		int data = 0 ;
		char ch;
		while(data!=-1)
		{
			data = fr.read();
			ch = (char)data;
			//System.out.print(ch + " ");
			if(ch>='a' && ch<='z')
			{
				data = data - 32; // converts it into uppercase
				fw.write((char)data + "");
			}
			else if(ch>='A' && ch<='Z')
			{
				data = data + 32; // converts it into lowercase
				fw.write((char)data + "");
			}
			else if(ch>='0' && ch<='0')
			{
				ch = '*';
				fw.write(ch + "");
			}
			else
			{
				fw.write((char)data + "");
			}
				
		}
		fw.flush();
		fr.close();
	}
}