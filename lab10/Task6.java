import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Task6 extends JPanel {

    ArrayList<Point> points = new ArrayList<>();

    public Task6() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                points.add(new Point(e.getX(), e.getY()));
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Point p : points) {
            g.fillOval(p.x, p.y, 5, 5);
        }

        if (!points.isEmpty()) {
            Point last = points.get(points.size() - 1);
            g.drawString("X: " + last.x + " Y: " + last.y, 20, 20);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task6");
        f.add(new Task6());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}