package Slip20B;
import java.awt.*;
import java.awt.event.*;
public class Slip20B extends Frame implements WindowListener
{
    Slip20B()
    {
        setTitle("TYBBACA");
        Color c = Color.red;
        setBackground(c);
        setVisible(true);
        setSize(500,500);
        addWindowListener(this);
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowClosed(WindowEvent e)
    {}
    public void windowOpened(WindowEvent e)
    {}
    public void windowIconified(WindowEvent e)
    {}
    public void windowDeiconified(WindowEvent e)
    {}
    public void windowActivated(WindowEvent e)
    {}
    public void windowDeactivated(WindowEvent e)
    {}
    public static void main(String[] args) {
        Slip20B ob = new Slip20B();
    }
}
