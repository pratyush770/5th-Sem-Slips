package Slip6B;
import java.util.Scanner;
class ZeroNumberException extends Exception
{
    @Override
    public String getMessage()
    {
        return ("Number is Zero");
    }
}
public class Slip6B
{
    static int r = 0;
    public static void main(String[] args)
    {
        int n,fd=0,ld=0;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            ld=n%10;  // to get last digit
            if (n == 0)
            {
                throw new ZeroNumberException();
            }
            else
            {
                while(n!=0)
                {
                    r=n%10;
                    fd=r;   // to get first digit
                    n=n/10;
                }
                System.out.println("The sum of first and last digit of the given number is : " + (fd+ld));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
