package Slip4B;
class Slip4B
{
public static void main(String[] args)
{
if(args.length>0)
{
String s = args[0];
System.out.println("The entered string is : " + s);
for(int i=0;i<s.length();i=i+2)
{
System.out.println("The alternate characters are : " + s.charAt(i));
}
}
else
{
System.out.println("Please enter an input");
}
}
}