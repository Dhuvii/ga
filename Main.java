import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Computer Graphics");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Canvas canvas = new Canvas();
            // Canvas_2018_2019 c_2018_2019 = new Canvas_2018_2019();
            // Canvas_2017_2018 c_2017_2018 = new Canvas_2017_2018();
            frame.add(canvas);
            frame.setSize(1000, 1000);
            frame.setVisible(true);
        });
    }
}
