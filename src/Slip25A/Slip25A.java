import java.util.Scanner;
class Slip25A
{
public static void main(String [] args)
{
String s = new String();
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string : ");
s=sc.nextLine();
System.out.println("The original string is : " + s);
StringBuffer buf = new StringBuffer(s);
buf=buf.reverse();
String s1; 
s1= new String(buf);
System.out.println("The reversed string is : " + s1);
if(s.equals(s1))
System.out.println("The entered string is palindrome");
else
System.out.println("The entered string is not palindrome");
}
} 