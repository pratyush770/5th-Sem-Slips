package Slip14A;
import java.awt.*;
import java.awt.event.*;
public class Slip14A extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3;
    Button b;
    TextArea te;
    Frame f;
    Slip14A()
    {
        Font fnt = new Font("Arial",Font.BOLD,18);
        setFont(fnt);
        l1=new Label("Enter the employee id : ");
        l2=new Label("Enter the employee name : ");
        l3=new Label("Enter the employee salary : ");
        l4=new Label("The employee id is : ");
        l5=new Label("The employee name is : ");
        l6=new Label("The employee salary is : ");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        b = new Button("Display");
        f= new Frame();
        f.setFont(fnt);
        te = new TextArea(4,2);
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(4,2));
        b.addActionListener(this);
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b);
        f.setSize(500,500);
        f.setVisible(false);
        f.addWindowListener(new MyWindowAdapter());
    }
    class MyWindowAdapter extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        String res = l4.getText()  + t1.getText() + "\n" + l5.getText()  + t2.getText() + "\n" + l6.getText() + t3.getText();
        te.append(res);
        f.add(te);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Slip14A ob = new Slip14A();
    }
}
