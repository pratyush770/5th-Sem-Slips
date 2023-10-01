package AWT;
import java.awt.*;  // for using awt package
import java.awt.event.*;  // for using events from awt package
public class AwtDemo extends Frame implements ActionListener  // extends Frame class and implements actionListener interface
{
    Label l1,l2,l3;  // Label declaration
    TextField t1,t2,t3;  // TextField declaration
    Button b;  // Button declaration
    AwtDemo()  // Constructor call
    {
        Font f = new Font("Arial", Font.BOLD,18);  // for changing the font
        setFont(f);  // for setting the font
        l1 = new Label("Enter the first number : ");  // for putting text inside the label
        l2 = new Label("Enter the second number : ");
        l3 = new Label("Result");
        t1= new TextField(10);  // for making TextField
        t2= new TextField(10);
        t3= new TextField(10);
        b = new Button("Add");  // for initializing the component Button
        add(l1);add(t1);  // adds the components i.e. label and TextField
        add(l2);add(t2);
        add(l3);add(t3);
        add(b);  // adds the component Button
        setSize(500,500);  // for setting the height and width of the frame
        setVisible(true);  // for making the Frame visible (default = false)
        //setLayout(new FlowLayout());  // makes the layout as per the flow
        setLayout(new GridLayout(4,2));  // for arranging the layout using grid i.e. rows and columns
        b.addActionListener(this);  // adds the event to the component Button
        t3.setEditable(false);  // makes it unable to edit the TextField
    }
    public void actionPerformed(ActionEvent e)  // overriding the abstract method actionPerformed
    {
        int a = Integer.parseInt(t1.getText());  // converts the String to integer
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        t3.setText(" "+c);  // sets the value for the TextField
    }
    public static void main(String[] args)
    {
        AwtDemo ob = new AwtDemo();  // object creation/instantiation
    }
}
