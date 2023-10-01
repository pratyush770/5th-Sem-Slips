import java.util.Scanner;
class Slip16B
{
	static int sumDig(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return (n%10 + sumDig(n/10));
	}
	public static void main(String [] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		System.out.println("The sum of digits of numbers using recursion is : " + sumDig(n));	
	}
}