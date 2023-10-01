import java.io.*;
public class FileIOStream
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fin = new FileInputStream("madara.jpg");
        FileOutputStream fos = new FileOutputStream("javaimg.jpg");
        int data = 0;
        while(data!=-1)
        {
            data = fin.read();
            fos.write(data);
        }
        fos.flush();
        fos.close();
        fin.close();
    }
}
