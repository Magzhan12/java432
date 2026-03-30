import javax.swing.*;
import java.awt.*;

public class Task8 extends JFrame {
    public Task8() {
        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);
        JLabel result = new JLabel("Result:");

        JButton btn = new JButton("+");
        btn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a + b));
        });

        setLayout(new FlowLayout());
        add(t1);
        add(t2);
        add(btn);
        add(result);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task8();
    }
}