import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ColorfulHelloWorld extends JFrame {

    private JLabel helloLabel;

    public ColorfulHelloWorld() {
        // Set up the JFrame
        setTitle("Colorful Hello, World!");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create the label with "Hello, World!"
        helloLabel = new JLabel("Hello, World!");
        helloLabel.setFont(new Font("Arial", Font.PLAIN, 24));

        // Add a mouse click listener to change the color on click
        helloLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changeColor();
            }
        });

        // Add the label to the JFrame
        add(helloLabel);

        // Set the JFrame visibility
        setVisible(true);
    }

    private void changeColor() {
        // Generate random RGB values
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        // Create a new color based on the random values
        Color randomColor = new Color(red, green, blue);

        // Set the label text color to the random color
        helloLabel.setForeground(randomColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ColorfulHelloWorld::new);
    }
}
