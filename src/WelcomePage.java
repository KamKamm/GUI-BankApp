import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage {
    private JFrame frame;
    private LandingPage landingPage;

    public WelcomePage(JFrame frame){
        this.frame = frame;
        setLayout(new BorderLayout());


        JLabel  welcomeLabel = new JLabel("Welcome the KBank ");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeLabel,BorderLayout.CENTER);

        JButton goTOLoginPageButton = new JButton("Click");

        goTOLoginPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLandingpage();

            }
        });
        add(goTOLoginPageButton,BorderLayout.SOUTH);
    }
    public  void showLandingpage(){
        frame.getContentPane().removeAll();
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();

        landingPage = new LandingPage(frame);
        frame.getContentPane().add(landingPage);

        frame.setVisible(true);

    }
}
