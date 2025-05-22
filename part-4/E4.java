import javax.swing.*;
import java.awt.*;

public class E4 {
    private JPanel Mainpanel ;
    public E4(){
        JFrame frame = new JFrame();
        frame.setTitle("Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6,1));
        frame.setSize(400,400);
        //---------------------------------------------------
        JPanel namepanel = new JPanel();
        namepanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel namelabel = new JLabel("Name: ");
        JTextField namefield = new JTextField(10);
        namepanel.add(namelabel);
        namepanel.add(namefield);
        //----------------------------------------------------
        JPanel passpanel = new JPanel();
        passpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel passlabel = new JLabel("Password: ");
        JPasswordField passfield = new JPasswordField(10);
        passpanel.add(passlabel);
        passpanel.add(passfield);
        //------------------------------------------------------
        JPanel emailpanel = new JPanel();
        emailpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel emaillabel = new JLabel("Email: ");
        JTextField emailfield = new JTextField(10);
        emailpanel.add(emaillabel);
        emailpanel.add(emailfield);
        //------------------------------------------------------
        JPanel Gender = new JPanel();
        Gender.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel genderlabel = new JLabel("Gender: ");
        JRadioButton Male = new JRadioButton("Male");
        JRadioButton Female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(Male);
        group.add(Female);
        Gender.add(genderlabel);
        Gender.add(Male);
        Gender.add(Female);
        //-------------------------------------------------------
        JPanel interestpanel = new JPanel();
        interestpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel interestlabel = new JLabel("Interest: ");
        JCheckBox Java = new JCheckBox("Java");
        JCheckBox Python = new JCheckBox("Python");
        JCheckBox C = new JCheckBox("C++");
        interestpanel.add(interestlabel);
        interestpanel.add(Java);
        interestpanel.add(Python);
        interestpanel.add(C);
        //------------------------------------------------------
        JButton submit = new JButton("Submit");
        submit.addActionListener(e -> {
            String name = "Name : "+namefield.getText();
            String Email = "Email : "+emailfield.getText();
            String GenderID = "Gender : ";
            if(Male.isSelected()){
                GenderID += "Male";
            }
            else if(Female.isSelected()){
                GenderID += "Female";
            }
            String interest = new String("Interest : ");
            if(Java.isSelected()){
                 interest += "Java ";
            }
            if(Python.isSelected()){
                 interest += "Python ";
            }
            if(C.isSelected()){
                interest += "C++ ";
            }
            String show = name +"\n"+Email+"\n"+GenderID+"\n"+interest;
            JOptionPane.showMessageDialog(null,show );
        });
        frame.add(namepanel);
        frame.add(passpanel);
        frame.add(emailpanel);
        frame.add(Gender);
        frame.add(interestpanel);
        frame.add(submit);
        frame.setVisible(true);

    }
 public static void main(String[] args) {
        new E4();
 }
}