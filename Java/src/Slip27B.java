import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Slip27B extends Frame implements ActionListener
{
    TextField t1;
    List l;
    Button b;
    Slip27B()
    {
        addWindowListener((new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        }));
        t1 = new TextField(15);
        l = new List();
        b = new Button("Display Files");
        setLayout(new GridLayout(3,1));
        setVisible(true);
        setSize(500,500);
        b.addActionListener(this);
        add(t1);
        add(l);
        add(b);
        Font f = new Font("Arial",Font.BOLD,20);
        setFont(f);
    }
    public void actionPerformed(ActionEvent e)
    {
        l.clear();
        File f = new File(t1.getText());
        if(f.isDirectory())
        {
            String s[] = f.list();
            for(int i = 0 ;i<s.length;i++)
                l.add(s[i]);
        }
    }
    public static void main(String[] args)
    {
        Slip27B ob = new Slip27B();
    }
}
