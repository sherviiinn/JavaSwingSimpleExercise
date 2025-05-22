import javax.swing.*;
import java.awt.*;

public class E3 {
    private JPanel Mainpanel;
    private JButton BluBtn;
    private JButton Redbtn;
    private JButton GreenBtn;
    public E3(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        Mainpanel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        BluBtn = new JButton("Blue");
        Redbtn = new JButton("Red");
        GreenBtn = new JButton("Green");
        BluBtn.addActionListener(e -> {
            Mainpanel.setBackground(Color.BLUE);
        });
        Redbtn.addActionListener(e -> {
            Mainpanel.setBackground(Color.RED);
        });
        GreenBtn.addActionListener(e -> {
            Mainpanel.setBackground(Color.GREEN);
        });
        panel.add(BluBtn);
        panel.add(Redbtn);
        panel.add(GreenBtn);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(Mainpanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        E3 e3 = new E3();
    }
}