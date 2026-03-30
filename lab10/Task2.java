import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {
    JLabel label;

    public Task2() {
        JButton btn = new JButton("Click");
        label = new JLabel("");

        btn.addActionListener(e -> label.setText("Hello Java"));

        setLayout(new FlowLayout());
        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}

