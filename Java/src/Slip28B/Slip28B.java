import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Slip28B extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2;
Container c;
JTable table;
String data[][]= new String[10][3];
String cols[]={"Eno","Ename","Salary"};
int i;
Slip28B()
{
c = getContentPane();
i=0;
l1 = new JLabel("Enter employee number : ");
l2 = new JLabel("Enter employee name : ");
l3 = new JLabel("Enter employee salary : ");
t1 = new JTextField(10);
t2 = new JTextField(10);
t3 = new JTextField(10);
b1 = new JButton("Store Employee Data");
b2 = new JButton("Display Employee Data");
c.add(l1);c.add(t1);
c.add(l2);c.add(t2);
c.add(l3);c.add(t3);
c.add(b1);c.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
setSize(300,150);
setVisible(true);
setLayout(new GridLayout(5,2));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int j =0;
data[i][j]=t1.getText();
data[i][++j]=t2.getText();
data[i][++j]=t3.getText();
i++;
t1.setText("");
t2.setText("");
t3.setText("");
}
else
if(e.getSource()==b2)
{
table = new JTable(data,cols);
c.add(table);
}
}
public static void main(String [] args)
{
Slip28B ob = new Slip28B();
}
}