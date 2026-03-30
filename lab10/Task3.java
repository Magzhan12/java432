import javax.swing.*;
import java.awt.*;

public class Task3 extends JFrame {
    JTextField tf;
    JLabel label;

    public Task3() {
        tf = new JTextField(15);
        JButton btn = new JButton("OK");
        label = new JLabel("");

        btn.addActionListener(e -> label.setText("Сәлем, " + tf.getText()));

        setLayout(new FlowLayout());
        add(tf);
        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}
















