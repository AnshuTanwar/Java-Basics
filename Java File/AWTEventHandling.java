import java.awt.*;
import java.awt.event.*;

public class AWTEventHandling {
    private Frame frame;
    private Button button;

    public AWTEventHandling() {
        frame = new Frame("AWT Event Handling Example");

        button = new Button("Click Me!");
        button.setBounds(100, 100, 80, 30);

        // Registering the ActionListener with the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showMessage();
            }
        });

        // Registering the WindowListener with the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding the button to the frame
        frame.add(button);

        // Setting frame size and layout
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void showMessage() {
        // Display a message in a dialog box when the button is clicked
        JOptionPane.showMessageDialog(frame, "Button Clicked!");
    }

    public static void main(String[] args) {
        new AWTEventHandling();
    }
}
