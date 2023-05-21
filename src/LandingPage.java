import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LandingPage extends JPanel{
    private static final String DEFAULT_PIN = "555";

    private static int LoginAttempts = 4;


    private JFrame frame;

    private JTextField pinField;


    public LandingPage(JFrame frame){
        this.frame = frame;
        setLayout(new FlowLayout());

        JLabel pinLabel = new JLabel("Enter your pin");
        pinField = new JTextField(10);
        JButton LoginButton = new JButton("Login");


        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredpin = pinField.getText();
                if (enteredpin.equals(DEFAULT_PIN)){
                    showWelcomePage();
                }else {
                    LoginAttempts--;
                    if (LoginAttempts>0){
                        JOptionPane.showMessageDialog(frame,"incorrect PIN.you have " + LoginAttempts +"More Attempts");
                    } else {
                        JOptionPane.showMessageDialog(frame,"");

                    }
                }
            }
        });
    }
}