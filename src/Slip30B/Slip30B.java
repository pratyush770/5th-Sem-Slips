package Slip30B;
import java.util.InputMismatchException;
import java.util.Scanner;
class ZeroNumberException extends Exception
{
    @Override
    public String getMessage()
    {
        return("Number is Zero");
    }
}
public class Slip30B
{
    public static void main(String[] args)
    {
        int n,r,s=0,tmp;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if(n == 0)
            {
                throw new ZeroNumberException();
            }
            else {
                tmp = n;
                while (n > 0) {
                    r = n % 10;
                    s = (s * 10) + r;
                    n = n / 10;
                }
                if (tmp == s) {
                    System.out.println("The entered number is a palindrome number");
                } else {
                    System.out.println("The entered number is not a palindrome number");
                }
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Number is Invalid");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
