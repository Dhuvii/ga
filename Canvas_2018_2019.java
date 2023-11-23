import java.awt.*;
import javax.swing.JPanel;

public class Canvas_2018_2019 extends JPanel {
    Dda dda = new Dda();
    BressenhamLine bl = new BressenhamLine();
    BressenhamCircle bc = new BressenhamCircle();

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

        int[] sq_point_a = { centerX - 100, centerY - 100 };
        int[] sq_point_b = { centerX + 100, centerY - 100 };
        int[] sq_point_c = { centerX + 100, centerY + 100 };
        int[] sq_point_d = { centerX - 100, centerY + 100 };

        int[] tri_point_a = { centerX, centerY - 100 };
        int[] tri_point_b = { centerX + 150, centerY + 200 };
        int[] tri_point_c = { centerX, centerY + 200 };

        int[] top_right_line_end = { centerX + 260, centerY - 260 };

        int circle_radius = 50;
        int[] circle_1 = { sq_point_b[0] + 35, sq_point_b[1] - 35 };
        int[] circle_2 = { sq_point_b[0] + 35 + 70, sq_point_b[1] - 35 - 70 };

        bl.draw(g, sq_point_a[0], sq_point_a[1], sq_point_b[0], sq_point_b[1]);
        bl.draw(g, sq_point_b[0], sq_point_b[1], sq_point_c[0], sq_point_c[1]);
        bl.draw(g, sq_point_d[0], sq_point_d[1], sq_point_c[0], sq_point_c[1]);
        bl.draw(g, sq_point_a[0], sq_point_a[1], sq_point_d[0], sq_point_d[1]);

        bl.draw(g, tri_point_a[0], tri_point_a[1], tri_point_b[0], tri_point_b[1]);
        bl.draw(g, tri_point_c[0], tri_point_c[1], tri_point_b[0], tri_point_b[1]);
        bl.draw(g, tri_point_a[0], tri_point_a[1], tri_point_c[0], tri_point_c[1]);

        bl.draw(g, sq_point_b[0], sq_point_b[1], top_right_line_end[0], top_right_line_end[1]);

        bc.draw(g, circle_radius, circle_1[0], circle_1[1]);
        bc.draw(g, circle_radius, circle_2[0], circle_2[1]);
    }
}