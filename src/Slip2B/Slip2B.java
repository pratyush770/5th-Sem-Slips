package Slip2B;
import java.util.Scanner;
class Slip2B
{
public static void main(String [] args)
{
String s = new String();  // taking input from user
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string : ");
s=sc.nextLine();
//String s = args[0];  // using command line argument
System.out.println("Entered string is : " + s);
for(int i=0;i<s.length();i++)
{
char ch = s.charAt(i);
if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
{
System.out.println("The vowels are : " + ch);
}
}
}
}