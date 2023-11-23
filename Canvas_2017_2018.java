import java.awt.*;

import javax.swing.JPanel;

public class Canvas_2017_2018 extends JPanel {
    BressenhamLine bl = new BressenhamLine();
    Manipulate manipulate = new Manipulate();

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

        int[][] yAxis = { { centerX, centerY - 400 }, { centerX, centerY } };
        int[][] xAxis = { { centerX, centerY }, { centerX + 400, centerY } };
        int[][] negative_xAxis = { { centerX - 200, centerY }, { centerX, centerY } };

        bl.draw(g, yAxis[0][0], yAxis[0][1], yAxis[1][0], yAxis[1][1]);
        bl.draw(g, xAxis[0][0], xAxis[0][1], xAxis[1][0], xAxis[1][1]);
        bl.draw(g, negative_xAxis[0][0], negative_xAxis[0][1], negative_xAxis[1][0], negative_xAxis[1][1]);

        int[] original_x_points = { 60, 180, 120 };
        int[] original_y_points = { -100, -100, -160 };

        /*
         * 
         * Scale
         */
        int[] scale_x_points = { 60, 180, 120 };
        int[] scale_y_points = { -100, -100, -160 };
        drawTriangle(g, original_x_points, original_y_points);

        manipulate.scale(g, scale_x_points, scale_y_points, 2, 2);
        drawTriangle(g, scale_x_points, scale_y_points);

        /*
         * 
         * Translate
         */

        int[] translate_x_points = { 60, 180, 120 };
        int[] translate_y_points = { -100, -100, -160 };

        int[][] translation_coords = { { translate_x_points[0], translate_y_points[0] },
                { translate_x_points[1], translate_y_points[1] }, { translate_x_points[2], translate_y_points[2] } };

        int[] translateBy = { 100, 80 };

        manipulate.translateLine(g, translation_coords, translateBy);
        int[] translation_coords_x = { translation_coords[0][0], translation_coords[1][0], translation_coords[2][0] };
        int[] translation_coords_y = { translation_coords[0][1], translation_coords[1][1], translation_coords[2][1] };
        drawTriangle(g, translation_coords_x, translation_coords_y);

        /*
         * 
         * rotate
         */
        double[] rotate_x_points = { 60, 180, 120 };
        double[] rotate_y_points = { -100, -100, -160 };

        double[][] rotation_coords = { { rotate_x_points[0], rotate_y_points[0] },
                { rotate_x_points[1], rotate_y_points[1] }, { rotate_x_points[2], rotate_y_points[2] } };

        int rotateBy = 180;

        manipulate.rotate(g, rotation_coords, (int) rotate_x_points[2], (int) rotate_y_points[2], rotateBy);
        double[] rotation_coords_x = { rotation_coords[0][0], rotation_coords[1][0], rotation_coords[2][0] };
        double[] rotation_coords_y = { rotation_coords[0][1], rotation_coords[1][1], rotation_coords[2][1] };
        drawTriangle(g, rotation_coords_x, rotation_coords_y);

        /*
         * 
         * Reflextion
         */

        int[] reflextion_x_points = { 60, 180, 120 };
        int[] reflextion_y_points = { -100, -100, -160 };

        int[][] reflextion_coords = { { reflextion_x_points[0], reflextion_y_points[0] },
                { reflextion_x_points[1], reflextion_y_points[1] },
                { reflextion_x_points[2], reflextion_y_points[2] } };

        manipulate.reflextion_y_axis(g, reflextion_coords);
        int[] reflextion_coords_x = { reflextion_coords[0][0], reflextion_coords[1][0], reflextion_coords[2][0] };
        int[] reflextion_coords_y = { reflextion_coords[0][1], reflextion_coords[1][1], reflextion_coords[2][1] };

        drawTriangle(g, reflextion_coords_x, reflextion_coords_y);

    }

    void drawTriangle(Graphics g, int[] x_points, int[] y_points) {
        int[] pointA = new int[2];
        int[] pointB = new int[2];
        int[] pointC = new int[2];

        pointA[0] = centerX + x_points[0];
        pointA[1] = centerY + y_points[0];

        pointB[0] = centerX + x_points[1];
        pointB[1] = centerY + y_points[1];

        pointC[0] = centerX + x_points[2];
        pointC[1] = centerY + y_points[2];

        bl.draw(g, pointA[0], pointA[1], pointB[0], pointB[1]);
        bl.draw(g, pointC[0], pointC[1], pointB[0], pointB[1]);
        bl.draw(g, pointA[0], pointA[1], pointC[0], pointC[1]);
    }

    void drawTriangle(Graphics g, double[] x_points, double[] y_points) {
        double[] pointA = new double[2];
        double[] pointB = new double[2];
        double[] pointC = new double[2];

        pointA[0] = centerX + x_points[0];
        pointA[1] = centerY + y_points[0];

        pointB[0] = centerX + x_points[1];
        pointB[1] = centerY + y_points[1];

        pointC[0] = centerX + x_points[2];
        pointC[1] = centerY + y_points[2];

        bl.draw(g, pointA[0], pointA[1], pointB[0], pointB[1]);
        bl.draw(g, pointC[0], pointC[1], pointB[0], pointB[1]);
        bl.draw(g, pointA[0], pointA[1], pointC[0], pointC[1]);
    }
}