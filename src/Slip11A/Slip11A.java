//package Slip11A;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Slip11A extends Applet implements ActionListener
    {
        int aa, bb, c,flag;
        Button b[];
        Button badd, bsub, bmul, bdiv, beq, bdot;
        TextField t1;
        Panel p1, p2;
        public void init()
        {
	    Frame title = (Frame)this.getParent().getParent();
	    title.setTitle("Simple Calculator");
            badd= new Button("+");
            bsub= new Button("-");
            bmul= new Button("*");
            bdiv= new Button("/");
            beq= new Button("=");
            bdot= new Button(".");
            t1 = new TextField(15);
            p1 = new Panel();
            p2 = new Panel();
            b = new Button[10];
            p1.add(t1);
            for(int i =0;i<10;i++)
            {
                b[i] = new Button(i + "");
                b[i].addActionListener(this);
                p2.add(b[i]);
            }
            badd.addActionListener(this);
            bsub.addActionListener(this);
            bmul.addActionListener(this);
            bdiv.addActionListener(this);
            beq.addActionListener(this);
            bdot.addActionListener(this);
            p2.add(b[1]);p2.add(b[2]);p2.add(b[3]);p2.add(badd);
            p2.add(b[4]);p2.add(b[5]);p2.add(b[6]);p2.add(bsub);
            p2.add(b[7]);p2.add(b[8]);p2.add(b[9]);p2.add(bmul);
            p2.add(b[0]);p2.add(bdot);p2.add(beq);p2.add(bdiv);
            p2.setLayout(new GridLayout(4,4));
            add(p1);
            add(p2);
            setLayout(new GridLayout(2,1));
            Font f = new Font("Arial",Font.BOLD,20);
            setFont(f);
        }
        public void actionPerformed(ActionEvent e)
        {
            Button x = (Button)e.getSource();
            if(!(x==badd || x==bsub || x==bmul || x==bdiv || x==beq || x==bdot ))
            {
                t1.setText(t1.getText()+x.getLabel());
            }
            else if (x == badd)
            {
                aa = Integer.parseInt(t1.getText().trim());
                t1.setText("");
                flag = 1;
            }
            else if (x == bsub)
            {
                aa = Integer.parseInt(t1.getText().trim());
                t1.setText("");
                flag = 2;
            }
            else if (x == bmul)
            {
                aa = Integer.parseInt(t1.getText().trim());
                t1.setText("");
                flag = 3;
            }
            else if (x == bdiv)
            {
                aa = Integer.parseInt(t1.getText().trim());
                t1.setText("");
                flag = 4;
            }
            else if(x==beq)
            {
                if(flag == 1)
                {
                    bb=Integer.parseInt(t1.getText().trim());
                    c = aa + bb;
                    t1.setText(c + "");
                }
                else if(flag == 2)
                {
                    bb=Integer.parseInt(t1.getText().trim());
                    c = aa - bb;
                    t1.setText(c + "");
                }
                else if(flag == 3)
                {
                    bb=Integer.parseInt(t1.getText().trim());
                    c = aa * bb;
                    t1.setText(c + "");
                }
                else if(flag == 4)
                {
                    bb=Integer.parseInt(t1.getText().trim());
                    c = aa / bb;
                    t1.setText(c + "");
                }
            }
        }
    }
/*
<html>
<applet code = Slip11A height = 300 width = 300>
</applet>
</html>
*/
