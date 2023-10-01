package Slip8B;
import java.util.Scanner;
interface Shape
{
    public void area();
    final double pi = Math.PI;
}
public class Slip8B implements Shape
{
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        int r;
        double a;
        System.out.print("Enter the radius of the circle : ");
        r=sc.nextInt();
        a=pi*r*r;
        System.out.println("The area of the circle is : " + a);
        a=4*pi*r*r;
        System.out.println("The area of the sphere is : " + a);
    }
    public static void main(String[] args)
    {
        Slip8B ob = new Slip8B();
        ob.area();
    }
}
