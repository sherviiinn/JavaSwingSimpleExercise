import javax.swing.*;
import java.awt.*;

public class E1 {
    private JLabel label;
    private JButton button;
    private int count = 0;
    public  E1() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setTitle("Counter");
        frame.setLayout(new BorderLayout());
        label = new JLabel("Click Counter : 0", JLabel.CENTER);
        button = new JButton("Click Me");
        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        button.addActionListener(e -> {
            count++;
            label.setText("Click Counter : " + count);
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E1());
    }
}