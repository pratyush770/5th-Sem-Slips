import java.util.Scanner;
class Slip9B
{
public static void main(String [] args)
{
int n1=0,n2=1,sum=0,n;
int i=2;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the limit : ");
n=sc.nextInt();
System.out.print(" " + n1);
System.out.print("," + n2);
while(i<n)
{
sum=n1+n2;
System.out.print("," + sum);
n1=n2;
n2=sum;
i++;
}
}
}