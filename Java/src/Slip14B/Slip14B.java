package Slip14B;
import java.util.Scanner;
public class Slip14B
{
    static int power(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }
        else
        {
            return (n * power(n, p - 1));
        }
    }
    public static void main(String[] args)
    {
        int n,p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        System.out.print("Enter the power : ");
        p=sc.nextInt();
        System.out.println("The power of the number using recursion is : " + power(n,p));
    }
}
