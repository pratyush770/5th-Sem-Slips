import java.io.*;
public class Slip8A
{
    public static void main(String[] args) throws Exception
    {
        File f = new File(args[0]);
        String s[] = f.list();
        for(int i = 0 ;i<s.length;i++)
        {
            String n = s[i];
            if(n.endsWith(".txt"))
                System.out.println(s[i]);
        }
    }
}
