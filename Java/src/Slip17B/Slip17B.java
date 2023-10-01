package Slip17B;
class Slip17B
{
public static void main(String [] arg)
{
int n=0,j=0,i=0;
int s=0,r=0,tmp=n;
int arm[]=new int[arg.length];
for(i=0;i<arg.length;i++)
{
s=0;
n=Integer.parseInt(arg[i]);
tmp=n;
while(n!=0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
// Loop to print the armstrong array
if(tmp==s)
{
arm[j]=tmp;
j++;
}
}
System.out.println("Printing the Armstrong Array...");
for(i=0;i<j;i++)
{
System.out.println("\t" + arm[i]);
}
}
}
