import Series.*;
import java.util.Scanner;
class Slip24A
{
public static void main(String [] args)
{
int n;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the limit : ");
n=sc.nextInt();
Fibo f = new Fibo();
System.out.println("The fibonacci series are : ");
f.funfibo(n);
System.out.print("Enter the limit : ");
n=sc.nextInt();
Square s = new Square();
System.out.println("The square of numbers are : ");
for(int i=0;i<n;i++)
{
int r=s.square(i);
System.out.println(" \t" + r);
}
System.out.print("Enter the limit : ");
n=sc.nextInt();
Cube c = new Cube();
System.out.println("The cube of numbers are : ");
for(int i=0;i<n;i++)
{
int r1=c.cube(i);
System.out.println(" \t" + r1);
}
}
}
