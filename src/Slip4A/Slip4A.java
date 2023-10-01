//Calculator in applet
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Slip4A extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
public void init()
{
l1 = new Label("Enter the first number : ");
l2 = new Label("Enter the second number : ");
l3 = new Label("Result : ");
t1 = new TextField(15);
t2 = new TextField(15);
t3 = new TextField(15);
b1 = new Button("Addition");
b2 = new Button("Subtraction");
b3 = new Button("Multiplication");
b4 = new Button("Division");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(b2);add(b3);add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this); 
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
int c = a+b;
t3.setText(c + ""); 
}
else if(e.getSource()==b2)
{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
int c = a-b;
t3.setText(c + ""); 
}
else if(e.getSource()==b3)
{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
int c = a*b;
t3.setText(c + ""); 
}
else if(e.getSource()==b4)
{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
int c = a/b;
t3.setText(c + ""); 
}
}
}
/*
<html>
<applet code = Slip4A height=300 width=300>
</applet>
</html>
*/