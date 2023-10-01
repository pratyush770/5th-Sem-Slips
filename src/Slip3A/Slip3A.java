package Slip3A;
import java.util.Scanner;
abstract class Shape{
    final float pi = 3.14f;
    abstract public void area();
    abstract public void volume();
}
class Cone extends Shape{
    int r,s,h;
    Cone(int r1,int s1,int h1){
        r=r1;
        s=s1;
        h=h1;
    }
    public void area(){
        float a = pi * r * s;
        System.out.println("The area of cone is : " + a);
    }
    public void volume(){
        float v=(pi*(r*r)*h)/3;
        System.out.println("The volume of cone is : " + v);
    }
}
class Cylinder extends Shape{
    int r,h;
    Cylinder(int r1,int h1){
        r=r1;
        h=h1;
    }
    public void area(){
        float a=2*pi*r*h+2*pi*r*r;
        System.out.println("The area of cylinder is : " + a);

    }
    public void volume(){
        float v=pi*r*r*h;
        System.out.println("The volume of cylinder is : " + v);

    }
}
public class Slip3A {
    public static void main(String[] args) {
        int r,s,h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cone : ");
        r=sc.nextInt();
        System.out.print("Enter the side  of the cone : ");
        s=sc.nextInt();
        System.out.print("Enter the height of the cone : ");
        h=sc.nextInt();
        Cone c1 = new Cone(r,s,h);
        c1.area();
        c1.volume();
        System.out.print("Enter the radius of the cylinder : ");
        r=sc.nextInt();
        System.out.print("Enter the height of the cylinder : ");
        h=sc.nextInt();
        Cylinder c2 = new Cylinder(r,h);
        c2.area();
        c2.volume();
    }
}
