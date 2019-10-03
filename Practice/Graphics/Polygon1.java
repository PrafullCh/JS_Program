import java.awt.*;
import java.applet.*;
/*
<applet code="Polygon1.class" width="500" height="500"></applet>
*/
public class Polygon1 extends Applet{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		int a[] = {150,180,180,160,140,120,120};
		int b[] = {130,150,170,190,190,170,150};
		g.fillPolygon(a,b,a.length);
	}
}