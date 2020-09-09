import java.awt.*;
import java.applet.*;

public class Huisapplet extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 120, 100, 60);
        g.drawLine(100, 60, 150, 120);
        g.drawLine(150, 120, 50, 120);
        g.drawRect(50, 120, 100 ,50 );
        g.drawRect(50, 140, 25, 30);
        g.drawRect(90,140,25,20);

    }
}