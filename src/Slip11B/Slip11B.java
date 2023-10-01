package Slip11B;
import java.util.Scanner;
class Slip11B
{
public static void add(int a,int b)
{
int c;
c=a+b;
System.out.println("The addition of the numbers is : "+c);
}
public static void sub(int a,int b)
{
int c;
c=b-a;
System.out.println("The subtraction of the numbers is : "+c);
}
public static void mul(int a,int b)
{
int c;
c=a*b;
System.out.println("The multiplication of the numbers is : "+c);
}
public static void div(int a,int b)
{
int c;
c=b/a;
System.out.println("The division of the numbers is : "+c);
}
public static void main(String[] arr)
{
int ch,a,b;
Scanner sc = new Scanner(System.in);
do
{
System.out.println("1) Addition");
System.out.println("2) Subtraction");
System.out.println("3) Multiplication");
System.out.println("4) Division");
System.out.println("5) Exit");
System.out.print("Enter your choice : ");
ch = sc.nextInt();
switch(ch)
{
case 1:
System.out.print("Enter the first number : ");
a=sc.nextInt();
System.out.print("Enter the second number : ");
b=sc.nextInt();
add(a,b);
break;
case 2:
System.out.print("Enter the first number : ");
a=sc.nextInt();
System.out.print("Enter the second number : ");
b=sc.nextInt();
sub(a,b);
break;
case 3:
System.out.print("Enter the first number : ");
a=sc.nextInt();
System.out.print("Enter the second number : ");
b=sc.nextInt();
mul(a,b);
break;
case 4:
System.out.print("Enter the first number : ");
a=sc.nextInt();
System.out.print("Enter the second number : ");
b=sc.nextInt();
div(a,b);
break;
case 5:
return;
default:
System.out.println("You have entered wrong choice");
}
}while(ch!=5);
}
}