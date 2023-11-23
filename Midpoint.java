import java.awt.Graphics;

public class Midpoint {
    void draw(Graphics g, int r, int xc, int yc) {
        int x = 0;
        int y = r;
        int p = 1 - r;

        while (x <= y) {
            System.out.println("( " + x + ", " + y + " )");
            plotCircle(g, x, y, xc, yc);
            if (p < 0) {
                p = p + (2 * x) + 3;
            } else {
                p = p + ((2 * (x - y)) + 5);
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