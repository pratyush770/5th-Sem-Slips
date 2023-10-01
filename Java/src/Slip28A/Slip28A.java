//package Slip28A;
import java.util.*;
public class Slip28A {
    public static void main(String[] args) {
        int count=0;
        ArrayList <String> lst = new ArrayList<>();
        for(int i = 0;i<args.length;i++){
            lst.add(args[i]);
        }
        for(int i = 0 ;i<lst.size();i++)
        {
            try
            {
                int j = Integer.parseInt(lst.get(i));
                count++;
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("The number of integers present in the list are : " + count);
    }
}
