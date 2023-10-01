import java.applet.*;
import java.awt.*;
/*
<html>
<applet code = Slip26B width="500" height="500">
</applet>
</html>
*/
public class Slip26B extends Applet
{
public void paint(Graphics g)
{
g.drawRect(200,300,100,100); // outer door
g.drawRect(225,350,50,50); // inner door
g.drawLine(200,300,245,230); // left side
g.drawLine(300,300,245,230); // right side
g.drawLine(245,150,245,230); // line above
g.drawRect(245,150,50,40);  // flag
}
}