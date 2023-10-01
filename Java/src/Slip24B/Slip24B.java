import java.io.*;
class Slip24B
{
public static void main(String [] arg) throws Exception
{
FileReader fr = new FileReader(arg[0]);
int data = 0;
int cd = 0,ca=0,cspc = 0;
while(data!=-1)
{
data = fr.read();
char ch = (char)data;
if(data!=-1)
{
if(ch>='0' && ch <='9')
cd ++;
else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
ca ++;
else if(ch==' ')
cspc ++; 
}
}
System.out.println("The total number of digits are : " + cd);
System.out.println("The total number of alphabets are : " + ca);
System.out.println("The total number of spaces are : " + cspc);
fr.close();
}
}