package Slip3B;
import java.util.Scanner;
class Slip3B
{
static int n;
public static void main(String [] args)
{
System.out.print("Enter a number : ");
Scanner sc = new Scanner(System.in);
Slip3B.n=sc.nextInt();
System.out.println("The entered number is : " + Slip3B.n);
int s = 0,r=0,tmp=Slip3B.n;
while(Slip3B.n!=0)
{
r=Slip3B.n%10;
s=s+(r*r*r);
Slip3B.n=Slip3B.n/10;
}
System.out.println("The sum of each digit is : " + s);
if(tmp==s)
{
System.out.println("The entered number is an Armstrong number");
}
else
{
System.out.println("The entered number is not an Armstrong number");
}
}
}