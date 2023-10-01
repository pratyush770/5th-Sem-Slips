import java.io.*;
class Slip21B
{
	public static void main(String [] args) throws Exception
	{
		FileReader fr = new FileReader(args[0]);
		int data = 0;
		char ch;
		String s= new String(""); // to store the char data in a String
		while(data!=-1)
		{
			data = fr.read();
			ch = (char)data;
			if(data!=-1)
			s=s+ch;
		}
		StringBuffer buf = new StringBuffer(s);
		buf = buf.reverse();
		s = new String(buf);
		System.out.print(s);
		fr.close();
	}
}