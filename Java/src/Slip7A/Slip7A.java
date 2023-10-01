package Slip7A;
import java.util.Scanner;
public class Slip7A
{
    int id,t,inn,not,avg;
    String n;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the player id : ");
        id=sc.nextInt();
        System.out.print("Enter the player name : ");
        n=sc.next();
        System.out.print("Enter the total runs scored : ");
        t=sc.nextInt();
        System.out.print("Enter the number of innings played : ");
        inn=sc.nextInt();
        System.out.print("Enter the number of times player was not out : ");
        not=sc.nextInt();
    }
    public void display()
    {
        System.out.println("The id of the player is : " + id);
        System.out.println("The name of the player is : " + n);
        System.out.println("The total runs scored by the player are : " + t);
        System.out.println("The number of innings played by the player is : " + inn);
        System.out.println("The number of times player was not out is : " + not);
    }
    public void calculate()
    {
        avg=t/inn;
        System.out.println("The average runs scored by the player is : " + avg);
    }
    public static void main(String[] args)
    {
        int i,n,max=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to execute : ");
        n=sc.nextInt();
        Slip7A ob[] = new Slip7A[n];
        for(i=0;i<n;i++)
        {
            ob[i] = new Slip7A();
            ob[i].accept();
            ob[i].display();
            ob[i].calculate();
        }
        for(i=0;i<n;i++)
        {
            if(max<ob[i].avg)
            {
                max=ob[i].avg;
            }
            System.out.println("The details of player having maximum average are : ");
            ob[i].display();
        }
    }
}
