import java.util.Scanner;
class Slip19B
{
void funfibo(int x)
{
int n1=0,n2=1,sum=0;
int i=2;
System.out.print(" " + n1);
System.out.print("," + n2);
while(i<x)
{
sum=n1+n2;
System.out.print("," + sum);
n1=n2;
n2=sum;
i++;
}
}
public static void main(String [] args)
{
int x;
//int cnt=Integer.parseInt(args[0]);
Scanner sc = new Scanner(System.in);
System.out.print("Enter the limit : ");
x=sc.nextInt();
Slip19B ob = new Slip19B();
ob.funfibo(x);
}
}