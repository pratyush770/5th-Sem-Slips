package Slip13A;
import java.util.Scanner;
class Slip13A
{
public static void main(String [] args)
{
String s = new String();
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name : ");
s=sc.nextLine();
s=s.toUpperCase();
System.out.print("Hello, " + s + " nice to meet you");
}
}