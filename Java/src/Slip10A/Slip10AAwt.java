package Slip10A;
// This slip is done using awt and is not the actual slip
import java.awt.*;
import java.awt.event.*;

public class Slip10AAwt extends Frame implements ActionListener
{

    Label l1,l2,l3,l4,l5,lt;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2,b3;
    Panel p1,p2,p3,p4,p5;
    Slip10AAwt()
    {
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();
        lt = new Label("Compound interest calculator",Label.CENTER);
        l1= new Label("Enter the principle amount :");
        l2= new Label("Enter the rate of interest :");
        l3= new Label("Enter the number of years : ");
        l4= new Label("The total amount is : ");
        l5= new Label("The interest amount is : ");
        t1 = new TextField(15);
        t2 = new TextField(5);
        t3 = new TextField(5);
        t4 = new TextField(15);
        t5 = new TextField(15);
        b1 = new Button("Calculate");
        b2 = new Button("Clear");
        b3 = new Button("Close");
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(5,1));
        p1.setLayout(new GridLayout(1,1));
        p1.add(lt);
        p2.setLayout(new GridLayout(1,2));
        p2.add(l1);p2.add(t1);
        p3.setLayout(new GridLayout(1,4));
        p3.add(l2);p3.add(t2);p3.add(l3);p3.add(t3);
        p4.setLayout(new GridLayout(2,2));
        p4.add(l4);p4.add(t4);
        p4.add(l5);p4.add(t5);
        p5.setLayout(new GridLayout(1,3));
        p5.add(b1);p5.add(b2);p5.add(b3);
        add(p1);add(p2);add(p3);add(p4);add(p5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t4.setEditable(false);
        t5.setEditable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int p = Integer.parseInt(t1.getText());
            int r = Integer.parseInt(t2.getText());
            int n = Integer.parseInt(t3.getText());
            float ci = (p*r*n)/100;
            float t = ci + p;
            t4.setText(ci + " ");
            t5.setText(t + " ");
        }
        else if(e.getSource()==b2)
        {
            t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");
        }
        else if(e.getSource()==b3)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Slip10AAwt ob = new Slip10AAwt();
    }
}
