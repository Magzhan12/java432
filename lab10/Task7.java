import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Task7 extends JPanel {
    char ch = ' ';

    public Task7() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                ch = e.getKeyChar();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Pressed: " + ch, 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task7");
        Task7 panel = new Task7();
        f.add(panel);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}