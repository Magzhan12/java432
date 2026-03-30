import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class Task10 extends JPanel {
    Color color = Color.RED;

    public Task10() {
        JCheckBox red = new JCheckBox("Red");
        JCheckBox green = new JCheckBox("Green");
        JCheckBox blue = new JCheckBox("Blue");

        ItemListener listener = e -> {
            if (red.isSelected()) color = Color.RED;
            if (green.isSelected()) color = Color.GREEN;
            if (blue.isSelected()) color = Color.BLUE;
            repaint();
        };

        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);

        add(red);
        add(green);
        add(blue);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task10");
        f.add(new Task10());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
