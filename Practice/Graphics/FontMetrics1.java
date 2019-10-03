import java.awt.*;
import java.applet.*;

/*
<applet code="FontMetrics1.class" width="1200" height="500"></applet>
*/

public class FontMetrics1 extends Applet{
	public void paint(Graphics g){
		Font f1 =   new Font("calibri",Font.BOLD,30);
		g.setFont(f1);
		FontMetrics f = g.getFontMetrics();
		g.drawString(f.toString(),100,100);
	}
}