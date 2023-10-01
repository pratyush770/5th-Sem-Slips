import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingDemo extends JFrame implements ActionListener
{
JPanel p1;
JTextField t1;
JButton b1;
JLabel l1;
SwingDemo()
{
Container c = getContentPane();
l1 = new JLabel("Enter a string : ");
t1 = new JTextField(15);
p1 = new JPanel();
b1 = new JButton("Click");
p1.add(l1);p1.add(t1);
p1.add(b1);
p1.setLayout(new FlowLayout());
c.add(p1);
b1.addActionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
setSize(500,200);
}
public void actionPerformed(ActionEvent e)
{
t1.setText("Welcome ..." + t1.getText());
}
public static void main(String [] args)
{
SwingDemo ob = new SwingDemo();
}
}