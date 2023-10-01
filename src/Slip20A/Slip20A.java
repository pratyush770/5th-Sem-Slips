package Slip20A;
import java.util.*;
public class Slip20A {
    public static void main(String[] args) {
        LinkedList <String> lst = new LinkedList<>();
        lst.add("CPP");
        lst.add("Java");
        lst.add("Python");
        lst.add("PHP");
        System.out.println("Displaying the contents using Iterator");
        Iterator it = lst.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Displaying the contents in reverse using ListIterator");
        ListIterator lit = lst.listIterator();
        Collections.reverse(lst);
        while(lit.hasNext()){
            System.out.print(lit.next() + " ");
        }
    }
}
