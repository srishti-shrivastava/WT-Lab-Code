

import java.applet.Applet;
import java.awt.*;

public class AppletClass extends Applet {
    public void init(){
        setBackground(Color.CYAN);
    }

    public void start(){

    }
    public void stop(){}
    public void destroy(){}
    public void paint(Graphics g){
        g.drawString("WELCOME",110,100);
    }

    
}