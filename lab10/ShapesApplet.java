import javax.swing.*;
import java.awt.*;

public class ShapesApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 70, 45);

        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 270, 45);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 90, 195);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        ShapesApplet panel = new ShapesApplet();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
