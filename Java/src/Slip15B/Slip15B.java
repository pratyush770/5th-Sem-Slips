import java.util.Scanner;
class Slip15B
{
	public static void main(String [] args)
	{
		int i,f=0;
		String s;
		String arr[] = {"Pratyush","Prayushi","Prakash","Suchismita"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name to be searched from the array : ");
		s =sc.next();
		for(i=0;i<arr.length;i++)
		{
			if(s.equals(arr[i]))
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("The index of the name you entered is : " + i);
		}
		else
		{
			System.out.println("Name not found in the array");
		}
	}
}