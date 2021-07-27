
import java.applet.*; 
import java.awt.*; 
  
public class lab9p2 extends Applet { 
    public void init() {
    setSize(400, 400);
    repaint();
  }
    public void paint(Graphics g) 
    {   
  
        g.setColor(Color.BLUE);
        g.drawOval(80, 70, 150, 150);
        g.fillOval(80, 70,150,150);
  
        
        g.setColor(Color.BLACK); 
        g.fillOval(120, 120, 15, 15); 
        g.fillOval(170, 120, 15, 15); 
  
       
        g.drawArc(130, 180, 50, 20, 180, 180); 
    } 
} 
/* 
<applet code="lab9p2.class" width="300" height="300"> 
</applet> 
*/
