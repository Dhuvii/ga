import java.awt.Graphics;

public class BressenhamLine {
    void draw(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int p = (2 * dy) - dx;

        int x = x1;
        int y = y1;

        if (Math.abs(dy) > Math.abs(dx)) {
            int y_start = y1 > y2 ? y2 : y1;
            int y_end = y2 > y1 ? y2 : y1;

            int step_y = y2 > y1 ? 1 : -1;
            int step_x = x2 > x1 ? 1 : -1;

            System.out.println("y_start: " + y_start + " y_end: " + y_end);
            while (y_start <= y_end) {
                System.out.println("x: " + x + " y: " + y);
                g.fillOval(x, y, 5, 5);
                if (p < 0) {
                    p = p + (2 * dx);
                } else {
                    p = p + (2 * (dx - dy));
                    x += step_x;
                }
                y += step_y;
                y_start++;
            }
        } else {
            int x_start = x1 > x2 ? x2 : x1;
            int x_end = x2 > x1 ? x2 : x1;

            int step_y = y2 > y1 ? 1 : -1;
            int step_x = x2 > x1 ? 1 : -1;

            while (x_start <= x_end) {
                g.fillOval(x, y, 5, 5);
                if (p < 0) {
                    p = p + (2 * dy);
                } else {
                    p = p + (2 * (dy - dx));
                    y += step_y;
                }
                x += step_x;
                x_start++;
            }
        }
    }

    void draw(Graphics g, double x1, double y1, double x2, double y2) {
        double dx = Math.abs(x2 - x1);
        double dy = Math.abs(y2 - y1);

        double p = (2 * dy) - dx;

        double x = x1;
        double y = y1;

        if (Math.abs(dy) > Math.abs(dx)) {
            double y_start = y1 > y2 ? y2 : y1;
            double y_end = y2 > y1 ? y2 : y1;

            double step_y = y2 > y1 ? 1 : -1;
            double step_x = x2 > x1 ? 1 : -1;

            System.out.println("y_start: " + y_start + " y_end: " + y_end);
            while (y_start <= y_end) {
                System.out.println("x: " + x + " y: " + y);
                g.fillOval((int) x, (int) y, 5, 5);
                if (p < 0) {
                    p = p + (2 * dx);
                } else {
                    p = p + (2 * (dx - dy));
                    x += step_x;
                }
                y += step_y;
                y_start++;
            }
        } else {
            double x_start = x1 > x2 ? x2 : x1;
            double x_end = x2 > x1 ? x2 : x1;

            double step_y = y2 > y1 ? 1 : -1;
            double step_x = x2 > x1 ? 1 : -1;
            while (x_start <= x_end) {
                g.fillOval((int) x, (int) y, 5, 5);
                if (p < 0) {
                    p = p + (2 * dy);
                } else {
                    p = p + (2 * (dy - dx));
                    y += step_y;
                }
                x += step_x;
                x_start++;
            }
        }
    }
}