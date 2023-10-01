package AWT;
import java.awt.*;
import java.awt.event.*;
class AwtString extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button bu,bl,br,bc;
    AwtString(){
        Font f = new Font("Arial",Font.BOLD,18);
        setFont(f);
        l1 = new Label ("Enter a string : ");
        l2= new Label("Result :");
        t1 = new TextField(20);
        t2 = new TextField(20);
        bu = new Button("Uppercase");
        bl = new Button("Lowercase");
        br = new Button("Reverse");
        bc = new Button("Clear");
        add(l1);add(t1);
        add(l2);add(t2);
        add(bu);
        add(bl);
        add(br);
        add(bc);
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(4,2));
        bu.addActionListener(this);
        bl.addActionListener(this);
        br.addActionListener(this);
        bc.addActionListener(this);
        t2.setEditable(false);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bu){
            String s = t1.getText();
            s=s.toUpperCase();
            t2.setText(s);
        }
        else if(e.getSource()==bl){
            String s = t1.getText();
            s=s.toLowerCase();
            t2.setText(s);
        }
        else if(e.getSource()==br){
            StringBuffer buf = new StringBuffer(t1.getText());
            buf = buf.reverse();
            String s = new String(buf);
            t2.setText(s);
        }
        else{
            t1.setText("");
            t2.setText("");
        }
    }
    public static void main(String[] args) {
        AwtString ob = new AwtString();
    }
}
