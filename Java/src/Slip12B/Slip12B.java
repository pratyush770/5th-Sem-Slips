package Slip12B;
public class Slip12B
{
    public static void main(String[] args)
    {
        int i =0;
        String s[] = {"Pratyush","Prayushi","Prakash"};
        String s1[] = new String[10];
        for(i=0;i<s.length;i++)
        {
           System.out.println("The original strings are : " + s[i]);
        }
	    System.out.println("");
        for(i=0;i<s.length;i++)
        {
            s1[i]=s[i];
            StringBuffer buf = new StringBuffer(s1[i]);
            buf = buf.reverse();
            System.out.println("The reverse strings are : " + buf);
        }
    }
}
