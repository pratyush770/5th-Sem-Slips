import java.util.Scanner;
class Slip17A
{
int id,price,qty;
String pname;
Scanner sc = new Scanner(System.in);
public void accept()
{
System.out.print("Enter the id of the product :  ");
id=sc.nextInt();
System.out.print("Enter the name of the product :  ");
pname=sc.next();
System.out.print("Enter the price of the product :  ");
price=sc.nextInt();
System.out.print("Enter the quantity of the product :  ");
qty=sc.nextInt();
}
public void display()
{
System.out.println("The id of the product is : " + id);
System.out.println("The name of the product is : " + pname);
System.out.println("The price of the product is : " + price);
System.out.println("The quantity of the product is : " + qty);
}
public void calculate()
{
int t = price*qty;
System.out.println("The total amount is : " + t);
}
public static void main(String [] args)
{
Slip17A ob[] = new Slip17A[2];
for(int i=0;i<2;i++)
{
ob[i]=new Slip17A();
ob[i].accept();
ob[i].display();
ob[i].calculate();
}
}
}