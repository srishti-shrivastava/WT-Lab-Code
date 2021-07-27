import java.applet.Applet;
import java.awt.*;

public class que10 extends Applet {
    public void init() {
        setSize(400, 400);
        repaint();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillArc(100,10,100,100,0,90);
        g.setColor(Color.red);
        g.fillArc(100,10,100,100,90,90);
        g.setColor(Color.green);
        g.fillArc(100,10,100,100,180,90);
        g.setColor(Color.cyan);
        g.fillArc(100,10,100,100,270,90);
    }
}