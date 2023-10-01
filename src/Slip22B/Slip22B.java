import java.util.Scanner;
class Slip22B
{
        static int facto(int n)
        {
                if(n==1)
                {
                        return 1;
                }
                return (n * facto(n-1));
        }
public static void main(String [] args)
{ 
        int n;
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
        n=sc.nextInt();
        System.out.println("The factorial of the given number using recursion is : " + facto(n));
}
}