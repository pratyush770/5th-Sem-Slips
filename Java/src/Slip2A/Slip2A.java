package Slip2A;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Slip2A extends JFrame
{
JTextField t1;
public Slip2A()
{
t1 = new JTextField(35);
Font f = new Font("Arial",Font.BOLD,24);
add(t1);
t1.setFont(f);
setLayout(new FlowLayout());
setSize(700,700);
setVisible(true);
addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e)
{
t1.setText("X Position : " + e.getX() + " Y Position : " + e.getY());
}
});
addMouseMotionListener(new MouseMotionAdapter()
{
    public void mouseMoved(MouseEvent e)
    {
        t1.setText("X Position : " + e.getX() + " Y Position : " + e.getY());
    }
});
}
public static void main(String [] args)
{
Slip2A ob = new Slip2A();
}
}
