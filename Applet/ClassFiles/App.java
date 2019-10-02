import java.awt.*;
import java.applet.*;

/*<applet code=App.class width=1000 height=1000></applet>*/

public class App extends Applet{
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(50,50,150,150);
    }
}