package Slip16A;

import java.util.*;

public class Slip16A
{
    static int i=0;
    String n;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.print("Enter the employee name : ");
        n=sc.next();
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        n=sc.nextInt();
        Slip16A ob[] = new Slip16A[n];
        for(i=0 ;i<n;i++)
        {
            ob[i] = new Slip16A();
            ob[i].accept();
        }
        String arr[] = new String[n];
        for(i=0;i<n;i++)
        {
            arr[i]=ob[i].n;
        }
        Arrays.sort(arr);
        System.out.println("Names in ascending order : ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
