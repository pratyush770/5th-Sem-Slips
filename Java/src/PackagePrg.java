import TYBCA.*;
class PackagePrg
{
public static void main(String [] args)
{
Maths m = new Maths();
System.out.println("Addition of two numbers is : " + m.add(4,6));
System.out.println("Addition of three floats is : " + m.add(4.2,6.3,2.1));
Maximum ob = new Maximum();
System.out.println("The maximum of three numbers is : " + ob.max(5,8,1));
}
}
