import java.awt.*;
import javax.swing.JPanel;

public class Canvas extends JPanel {
    Dda dda = new Dda();
    Midpoint mpc = new Midpoint();
    BressenhamLine bl = new BressenhamLine();
    BressenhamCircle bc = new BressenhamCircle();

    Manipulate man = new Manipulate();

    int centerX, centerY, dGrid = 1, maxX, maxY;

    void initgr() {
        Dimension d = getSize();
        maxX = d.width - 1;
        maxY = d.height - 1;
        centerX = maxX / 2;
        centerY = maxY / 2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        initgr();

        bl.draw(g, centerX, centerY, centerX, centerY - 300);
        bl.draw(g, centerX, centerY, centerX, centerY + 300);
        bl.draw(g, centerX, centerY, centerX - 300, centerY);
        bl.draw(g, centerX, centerY, centerX + 300, centerY);

        bl.draw(g, centerX, centerY, centerX + 300, centerY - 300);
        bl.draw(g, centerX, centerY, centerX + 300, centerY + 300);
        bl.draw(g, centerX, centerY, centerX - 300, centerY + 300);
        bl.draw(g, centerX, centerY, centerX - 300, centerY - 300);
    }
}