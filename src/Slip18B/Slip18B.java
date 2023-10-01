package Slip18B;
import java.util.Scanner;

public class Slip18B {
    public void area(int r)
    {
        double a;
        a=Math.PI*r*r;
        System.out.println("The area of the circle is : " + a);
    }
    public void area(int l, int w)
    {
        int a;
        a=l*w;
        System.out.println("The area of the rectangle is : " + a);
    }
    public void area(float b, float h)
    {
        float a;
        a=b*h/2;
        System.out.println("The area of the triangle is : " + a);

    }
    public static void main(String[] args) {
        Slip18B ob = new Slip18B();
        Scanner sc = new Scanner(System.in);
        int r,l,w;
        float b,h;
        System.out.print("Enter the radius of the circle : ");
        r=sc.nextInt();
        ob.area(r);
        System.out.print("Enter the length of the rectangle : ");
        l=sc.nextInt();
        System.out.print("Enter the width of the rectangle : ");
        w=sc.nextInt();
        ob.area(l,w);
        System.out.print("Enter the base of the triangle : ");
        b=sc.nextFloat();
        System.out.print("Enter the height of the triangle : ");
        h=sc.nextFloat();
        ob.area(b,h);
    }
}
