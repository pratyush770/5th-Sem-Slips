package Slip7B;
import java.awt.*;
import java.awt.event.*;
public class Slip7B extends Frame
{
    Label l;
    Slip7B()
    {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        l = new Label("This is slip 7B");
        setTitle("Dr DY Patil College");
        Color c = Color.red;
        setBackground(c);
        Color c1 = Color.white;
        l.setForeground(c1);
        Font f = new Font("Arial",Font.BOLD,18);
        setFont(f);
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l);
    }
    public static void main(String[] args) {
        Slip7B ob = new Slip7B();
    }
}
