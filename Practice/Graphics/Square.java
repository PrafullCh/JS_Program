import java.awt.*;
import java.applet.*;

/*<applet code="Square.class" width="500" height="500"></applet>*/

public class Square extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.fillRect(100,50,90,90);//filledSquare
		g.drawRect(200,50,90,90);//Square
		g.fillRect(100,150,180,90);//filled rectangle
		g.drawRect(290,150,180,90);//rectangle
	}
}