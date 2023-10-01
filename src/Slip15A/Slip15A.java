import java.applet.*;
import java.awt.*;
/*
<html>
<applet code = Slip15A width="500" height="500">
</applet>
</html>
*/
public class Slip15A extends Applet
{
public void paint(Graphics g)
{
Color c = Color.RED;
g.setColor(c);
g.fillOval(100,100,250,250);  //face
g.setColor(Color.GRAY);
g.fillOval(168,169,36,36); //left eye
g.fillOval(248,169,36,36); //right eye
g.setColor(Color.BLACK);
g.fillOval(170,170,30,30);  //left eye
g.fillOval(250,170,30,30);  //right eye
g.drawLine(225,200,225,240);  //nose
g.fillOval(55,170,50,50);  //left ear
g.fillOval(345,170,50,50);  //right ear
g.fillArc(190,220,70,60,180,180);  //smile
}
}