//package Slip21A;
import java.util.*;
public class Slip21A
{
    public static void main(String[] args)
    {
        Hashtable hash = new Hashtable();
        int f = 0;
        String str = "", str1 = "", str2 = "";
        hash.put("Delhi", "011");
        hash.put("Pune", "012");
        hash.put("Mumbai", "013");
        hash.put("Nagpur", "014");
        // use Enumeration to iterate through the hashtable
        Enumeration names = hash.keys();
        System.out.println("Printing the entire hashtable..");
        while (names.hasMoreElements())
        {
            str = (String) names.nextElement();
            str2 = (String) hash.get(str);
            System.out.println("\t City : " + str);
            System.out.println("\t Code : " + str2);
        }
        names = hash.keys();
        System.out.println("\t Searching the code for required city");
        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            str2 = (String) hash.get(str);
            if (str.equals(args[0])) {
                f = 1;
                System.out.println("\t City found");
                System.out.println("\t City : " + str);
                System.out.println("\t Code : " + str2);
                break;
            } else
                f = 0;
        }
            if (f == 0)
                System.out.println("City not found");
        }
    }
