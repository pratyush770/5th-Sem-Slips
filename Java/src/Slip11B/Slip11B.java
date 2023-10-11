import java.util.Scanner;
class Slip11B
{
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int n3;
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    n3 = n1+ n2;
                    System.out.println("The addition of the two numbers is : " + n3);
                    break;
                case 2:
                    n3 = n2- n1;
                    System.out.println("The subtraction of the two numbers is : " + n3);
                    break;
                case 3:
                    n3 = n1* n2;
                    System.out.println("The multiplication of the two numbers is : " + n3);
                    break;
                case 4:
                    n3 = n2/ n1;
                    System.out.println("The division of the two numbers is : " + n3);
                    break;
            }
        }while(ch!=4);
    }
}