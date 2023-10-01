import java.io.*;
public class Slip1A
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter("abc.txt");
        int data = 0;
        char ch;
        while(data!=-1)
        {
            data = fr.read();
            ch = (char)data;
            if(ch>='0' && ch<='9')
                ;
            else
            {
                fw.write((char)data + "");
            }
        }
        fw.flush();
        fr.close();
    }
}
