import java.awt.*;

public class Dda {
    void draw(Graphics g, int x1, int y1, int x2, int y2) {
        System.out.println("dda");
        System.out.println("x1: " + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);
        System.out.println();
        int dx = x2 - x1;
        int dy = y2 - y1;

        int step;

        if (Math.abs(dx) > Math.abs(dy))
            step = Math.abs(dx);
        else
            step = Math.abs(dy);

        float x_incr = (float) dx / step;
        float y_incr = (float) dy / step;

        float x = x1;
        float y = y1;

        for (int i = 0; i < step; i++) {
            System.out.println("DDA -> (" + x + ", " + y + " )");
            g.fillOval(Math.round(x), Math.round(y), 5, 5);
            x += x_incr;
            y += y_incr;
        }
    }

    void draw(Graphics g, double x0, double y0, double x1, double y1) {
        double dx = x1 - x0;
        double dy = y1 - y0;

        double step;

        if (Math.abs(dx) > Math.abs(dy))
            step = Math.abs(dx);
        else
            step = Math.abs(dy);

        double x_incr = (double) dx / step;
        double y_incr = (double) dy / step;

        double x = x0;
        double y = y0;

        for (int i = 0; i < step; i++) {
            g.fillOval((int) Math.round(x), (int) Math.round(y), 5, 5);
            x += x_incr;
            y += y_incr;
        }
    }
}
