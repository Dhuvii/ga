import java.awt.Graphics;

public class Manipulate {

    void translatePoint(Graphics g, int[] p, int[] t) {
        p[0] = p[0] + t[0];
        p[1] = p[1] + t[1];
    }

    // overload for double
    void translatePoint(Graphics g, double[] p, int[] t) {
        p[0] = p[0] + t[0];
        p[1] = p[1] + t[1];
    }

    void translateLine(Graphics g, int[][] p, int[] t) {
        for (int i = 0; i < p.length; i++) {
            int[] point = p[i];
            translatePoint(g, point, t);
        }
    }

    void scale(Graphics g, int[] x, int[] y, int sx, int sy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * sx;
        }

        for (int i = 0; i < x.length; i++) {
            y[i] = y[i] * sy;
        }
    }

    void scale(Graphics g, double[] x, double[] y, double sx, double sy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * sx;
        }

        for (int i = 0; i < x.length; i++) {
            y[i] = y[i] * sy;
        }
    }

    void rotatePoint(Graphics g, double[] point, int x_pivot, int y_pivot, double angle) {
        int[] translate_1 = { -x_pivot, -y_pivot };
        int[] translate_2 = { x_pivot, y_pivot };
        translatePoint(g, point, translate_1);
        double p0 = (point[0] * Math.cos(Math.toRadians(angle))) + (point[1] * -1 * Math.sin(Math.toRadians(angle)));
        double p1 = (point[0] * Math.sin(Math.toRadians(angle))) + (point[1] * Math.cos(Math.toRadians(angle)));
        point[0] = p0;
        point[1] = p1;
        translatePoint(g, point, translate_2);
    }

    void rotate(Graphics g, double[][] coordinates, int x_pivot, int y_pivot, int angle) {
        for (int i = 0; i < coordinates.length; i++) {
            double[] point = coordinates[i];
            rotatePoint(g, point, x_pivot, y_pivot, angle);
        }
    }

    void reflextion_y_axis_point(Graphics g, int[] point) {
        point[0] = point[0] * -1;
        point[1] = point[1];
    }

    void reflextion_y_axis(Graphics g, int[][] coordinates) {
        for (int i = 0; i < coordinates.length; i++) {
            int[] point = coordinates[i];
            reflextion_y_axis_point(g, point);
        }
    }
}
