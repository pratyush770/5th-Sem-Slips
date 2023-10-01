import java.io.*;
import java.util.Scanner;
class Slip22A
{
	public static void main(String []args) throws Exception
	{
		File f1,f2;
		String s1,s2;
		int ch;
		do
		{
		System.out.println("1)To create a file");
		System.out.println("2)To rename a file");
		System.out.println("3)To delete a file");
		System.out.println("4)To display path of a file");
		System.out.print("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
			case 1 :
				System.out.print("Enter file name : ");
				sc = new Scanner(System.in);
				String fname = sc.nextLine();
				FileWriter fr = new FileWriter(fname);
				System.out.println("File created successfully");
				break;
			case 2 :
				System.out.print("Enter original file name : ");
				sc = new Scanner(System.in);
				s1 = sc.nextLine();
				System.out.print("Enter new file name : ");
				sc = new Scanner(System.in);
				s2 = sc.nextLine();
				f1 = new File(s1);
				f2 = new File(s2);
				f1.renameTo(f2);
				System.out.println("File renamed successfully");
				break;
			case 3 :
				System.out.print("Enter file name to delete : ");
				sc = new Scanner(System.in);
				s1 = sc.nextLine();
				f1 = new File(s1);
				f1.delete();
				System.out.println("File deleted successfully");
				break;
			case 4 :
				System.out.print("Enter file name : ");
				sc = new Scanner(System.in);
				s1 = sc.nextLine();
				f1 = new File(s1);
				System.out.println("The path of the file is " + f1.getAbsolutePath());
				break;
			case 5:
				return;			
		}
	        }while(ch!=4);
	}
}