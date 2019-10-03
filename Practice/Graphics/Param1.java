import java.awt.*;
import java.applet.*;

/*
<applet code="Param1.class" height="500" width="1000">
<param name="name" value="prafull"></param>
<param name="size" value="30"></param>
<param name="font" value="Times New Roman"></param>
<param name="style" value="2"></param>
</applet>
*/

public class Param1 extends Applet {
	
	public void paint(Graphics g){
		int size  = Integer.parseInt(getParameter("size"));
		int style = Integer.parseInt(getParameter("style"));
		Font font = new Font(getParameter("font"),style,size);
		g.setFont(font);
		String str = getParameter("name");
		g.drawString(str,100,100);
	}
}