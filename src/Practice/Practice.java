// Define an abstract class Hospital with protected members id and name. Define a parameterized constructor. Define 1 subclass Doctor with member department. Create 'n' objects of doctor class and display all details
import java.util.Scanner;
abstract class Hospital
{
protected int id;
protected String name;
abstract void display();
	Hospital(int i,String n)
	{
	id=i;
	name=n;
	}
}
class Doctor extends Hospital
{
int dep;
	Doctor(int i,String n,int d)
	{
	super(i,n);
	dep=d;
	}
public void display()
{
System.out.println("The id is : " + id);
System.out.println("The name is : " + name);
System.out.println("The department id is : " + dep);
}
}
class Practice
{
public static void main(String [] args)
{
int i,dep;
String n;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the id : ");
i=sc.nextInt();
System.out.print("Enter the name : ");
n=sc.next();
System.out.print("Enter the department id : ");
dep=sc.nextInt();
Doctor d = new Doctor(i,n,dep);
d.display();
}
}

