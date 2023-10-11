package Slip13B;
import java.util.*;
public class Slip13B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,n,i;
        ArrayList <Integer> lst = new ArrayList<>();
        System.out.print("Enter the size of the ArrayList : ");
        s = sc.nextInt();
        for(i=1;i<=s;i++)
        {
            System.out.print("Enter the number : ");
            n=sc.nextInt();
            lst.add(n);
        }
        System.out.println("The elements of the ArrayList in reverse are : ");
        Iterator it = lst.iterator();
        Collections.reverse(lst);
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
}
