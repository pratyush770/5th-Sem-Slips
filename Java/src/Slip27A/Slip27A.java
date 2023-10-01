package Slip27A;
import java.util.Scanner;
class OutOfRangeException extends Exception
{
    @Override
    public String getMessage()
    {
        return("Number is out of Range");
    }
}
public class Slip27A
{
    static  int i=0;
    public static void main(String[] args)
    {
        int n;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            n=sc.nextInt();
            if(n>1000)
            {
                throw new OutOfRangeException();
            }
            else
            {
                System.out.print("The factors of " + n + " are : ");
               for(i=1;i<=n;i++)
               {
                   if(n%i==0)
                   {
                       System.out.print(i + " ");
                   }
               }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
