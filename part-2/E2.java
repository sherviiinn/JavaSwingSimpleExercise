import javax.swing.*;
import java.awt.*;
public class E2 {
    private JTextField nameField;   // Field for user input
    private JButton greetButton;    // Button to trigger greeting
    private JLabel messageLabel;
    public E2(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Part-2");
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        messageLabel  = new JLabel("Name : ");
        nameField = new JTextField(10);
        greetButton = new JButton("Greet");
        panel.add(messageLabel);
        panel.add(nameField);
        panel.add(greetButton);
        frame.add(panel, BorderLayout.NORTH);
        JLabel label2 = new JLabel("Enter Your Name and Press Greet ", SwingConstants.CENTER);
        frame.add(label2, BorderLayout.CENTER);
        greetButton.addActionListener(e -> {
            if (nameField.getText().isEmpty()) {
                messageLabel.setText("Please enter a name :");
            } else {
                label2.setText("Hello,"+nameField.getText()+"!");
            }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {new E2();});
    }
}