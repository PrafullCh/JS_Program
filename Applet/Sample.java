import java.awt.*;
import java.applet.*;
/*<applet code="Sample.class" width="200" height="200"></applet>*/
public class Sample extends Applet{
        String msg="This is string to be displayed in applet ";
        public void init()
        {
            msg+="init() ";
        }
        public void start()
        {
            msg+="start() ";
        }
        public void stop()
        {
            msg+="stop() ";
        }
        public void paint(Graphics g)
        {
            g.drawString(msg,100,100);
            showStatus("Testing Applet");
        }
}