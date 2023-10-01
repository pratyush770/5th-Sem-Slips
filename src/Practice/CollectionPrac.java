//package Practice;
import java.util.*;
public class CollectionPrac{
    public static void main(String[] args) {
        LinkedList lt = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n,num;
        System.out.print("Enter the size : ");
        n=sc.nextInt();
        for(int i = 1 ; i<=n;i++)
        {
            System.out.print("Enter the number : ");
            num = sc.nextInt();
            lt.add(num);
        }
        System.out.println("Printing the list using Iterator");
        Iterator it = lt.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Printing the list using ListIterator");
        ListIterator iter = lt.listIterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }
}
