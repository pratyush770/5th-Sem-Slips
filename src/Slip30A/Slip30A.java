package Slip30A;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Slip30A extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,lt;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JCheckBox c1,c2,c3;
    JPanel p1,p2,p3,p4,p5;
    Font f;
    Slip30A()
    {
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        f=new Font("Arial",Font.BOLD,20);
        setFont(f);
        lt= new JLabel("<html> <u>Personal Information </u> </html>",JLabel.CENTER);
        l1 = new JLabel("First Name : ");
        l2 = new JLabel("Last Name : ");
        l3 = new JLabel("Address : ");
        l4 = new JLabel("Mobile Number : ");
        l5 = new JLabel("Gender");
        l6 = new JLabel("Your interests");
        t1= new JTextField(15);
        t2= new JTextField(15);
        t3= new JTextField(15);
        t4= new JTextField(15);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c1 = new JCheckBox("Computer");
        c2 = new JCheckBox("Sports");
        c3 = new JCheckBox("Music");
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(5,1));
        p1.setLayout(new GridLayout(1,1));
        p1.add(lt);
        p2.setLayout(new GridLayout(4,2));
        p2.add(l1);p2.add(t1);
        p2.add(l2);p2.add(t2);
        p2.add(l3);p2.add(t3);
        p2.add(l4);p2.add(t4);
        p3.setLayout(new GridLayout(1,3));
        p3.add(l5);p3.add(r1);p3.add(r2);
        p4.setLayout(new GridLayout(1,4));
        p4.add(l6);p4.add(c1);p4.add(c2);p4.add(c3);
        p5.setLayout(new GridLayout(1,2));
        p5.add(b1);p5.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            t1.setText("");t2.setText("");t3.setText("");t4.setText("");
        }
    }

    public static void main(String[] args)
    {
        Slip30A ob = new Slip30A();
    }
}
