import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BorderLayoutDemo extends JFrame
{
	JButton b1,b2,b3,b4,b5;
	BorderLayoutDemo()
	{
		b1 = new JButton("North");
		b2 = new JButton("South");
		b3 = new JButton("East");
		b4 = new JButton("West");
		b5 = new JButton("Center");
		setSize(500,500);
		setVisible(true);
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
	}
	public static void main(String [] args)
	{
		BorderLayoutDemo ob = new BorderLayoutDemo();
	}
}