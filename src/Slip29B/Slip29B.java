package Slip29B;
import java.util.Scanner;
class InvalidAgeException extends Exception {
    @Override
    public String getMessage() {
        return ("Your age is less than 18 so you are not eligible for voting");
    }
}
class InvalidAgeException1 extends Exception
{
    @Override
    public String getMessage() {
        return ("Your age is more than 60 so you are not eligible for voting");
    }
}

public class Slip29B
{
    public static void main(String[] args)
    {
        int n;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age : ");
            n=sc.nextInt();
            if(n<18)
            {
                throw new InvalidAgeException();
            }
            else if(n>60)
            {
                throw new InvalidAgeException1();
            }
            else
            {
                System.out.println("You are eligible for voting");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
