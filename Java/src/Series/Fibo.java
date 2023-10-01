package Series;
import java.util.Scanner;
public class Fibo
{
public void funfibo(int x)
{
int n1=0,n2=1,sum=0;
int i=2;
System.out.print(n1 + "," + n2);
while(i<x)
{
sum=n1+n2;
System.out.print("," + sum);
n1=n2;
n2=sum;
i++;
}
System.out.println();
}
}