import java.io.*;
class FileWriteDemo
{
    public static void main(String [] args) throws Exception
    {
        FileWriter ob = new FileWriter("abc.txt");
        String s = args[0];
        ob.write(s);
        ob.flush();
        ob.close();
    }
}