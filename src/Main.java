import javax.swing.*;


public class Main {
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { createAndShowGUI();}
        });
    }

    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Welcome");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

            WelcomePage welcomePage  = new WelcomePage(frame);
            frame.getContentPane().add(WelcomePage);

            frame.setVisible(true);
    }
}