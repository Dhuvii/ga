import java.awt.Graphics;

public class BressenhamCircle {
    void draw(Graphics g, int r, int xc, int yc) {
        int x = 0;
        int y = r;
        int p = 3 - (2 * r);

        while (x <= y) {
            System.out.println("( " + x + ", " + y + " )");
            plotCircle(g, x, y, xc, yc);
            if (p < 0) {
                p = p + (4 * x) + 6;
            } else {
                p = p + (4 * (x - y) + 10);
                y--;
            }
            x++;
        }
    }

    void plotCircle(Graphics g, int x, int y, int xc, int yc) {
        g.fillOval(y + xc, x + yc, 5, 5);
        g.fillOval(x + xc, y + yc, 5, 5);
        g.fillOval(x + xc, -y + yc, 5, 5);
        g.fillOval(y + xc, -x + yc, 5, 5);

        g.fillOval(-y + xc, -x + yc, 5, 5);
        g.fillOval(-x + xc, -y + yc, 5, 5);
        g.fillOval(-x + xc, y + yc, 5, 5);
        g.fillOval(-y + xc, x + yc, 5, 5);
    }
}
