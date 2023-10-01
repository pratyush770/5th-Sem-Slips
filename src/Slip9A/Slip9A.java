//package Slip9A;
import java.util.Scanner;
class InvalidPanException extends Exception
{
    @Override
    public String getMessage()
    {
        return("Invalid PAN Number. Number should be alphanumeric and must contain 10 digits");
    }
}
class InvalidPhoneException extends Exception
{
    @Override
    public String getMessage()
    {
        return ("Invalid Mobile Number. Number should not contain alphabets and must contain atleast 10 digits");
    }
}
public class Slip9A
{
    public static void main(String[] args)
    {
        String s,n;
	int f=0;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter PAN Number : ");
            s=sc.next();
            System.out.print("Enter Mobile Number : ");
            n=sc.next();
            if(s.length()<10 || s.length()>10)
            {
                throw new InvalidPanException();
            }
            if(n.length()<10 || n.length()>10)
            {
                throw new InvalidPhoneException();
            }
            for(int i = 0 ;i<n.length();i++)
            {
		if(n.charAt(i)>='0' && n.charAt(i)<='9')
			f=1;
		else
			f=0;	
			break;		
                //System.out.println("The entered phone number is : "+n);
            }
	    if(f==0)
		throw new InvalidPhoneException();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
