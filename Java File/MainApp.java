import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollingWordsApplet extends JApplet implements ActionListener {
    private int x, yHappy, yDeepavali;
    private Timer timer;

    public void init() {
        x = 150; // initial x-coordinate for both words
        yHappy = 0; // initial y-coordinate for "happy"
        yDeepavali = getHeight(); // initial y-coordinate for "deepavali"

        timer = new Timer(20, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw "happy"
        g.drawString("happy", x, yHappy);

        // Draw "deepavali"
        g.drawString("deepavali", x, yDeepavali);
    }

    public void actionPerformed(ActionEvent e) {
        // Move both words down/up
        yHappy += 2;
        yDeepavali -= 2;

        repaint();

        // Check if both words have reached the center
        if (yHappy >= getHeight() / 2 && yDeepavali <= getHeight() / 2) {
            timer.stop();
        }
    }
}



public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Scrolling Words Applet");
            ScrollingWordsApplet applet = new ScrollingWordsApplet();

            frame.getContentPane().add(applet);
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            // Initialize the applet
            applet.init();

            // Start the applet
            applet.start();
        });
    }
}
