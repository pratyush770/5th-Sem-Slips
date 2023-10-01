import java.io.*;
class Slip26A
{
    public static void main(String [] args) throws Exception
    {
        FileReader fr = new FileReader(args[0]);
        int data = 0;
	while(data!=-1)
	{
		data = fr.read();
		if(data!=-1)
		//System.out.print((char)data); // prints characters
		System.out.print(data + " "); // prints characters in ascii code
	}
	fr.close();
    }
}