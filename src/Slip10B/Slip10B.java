package Slip10B;
import java.util.Scanner;
public class Slip10B
{
    public static void main(String[] args)
    {
        String s = new String();
        int i;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        s = sc.next();
        System.out.println("The entered string is : " + s);
        for(ch='a';ch<='z';ch++)
        {
	    int count = 0;
            for (i = 0; i < s.length(); i++)
            {
                if (ch == s.charAt(i))
                    count++;
            }
            if (count != 0)
                System.out.println("The occurence of character " + ch + " is " + count);
        }
    }
}
