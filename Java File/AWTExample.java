import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    private Frame frame;
    private Choice choice;
    private Button button;
    private Checkbox checkbox1, checkbox2;
    private CheckboxGroup checkboxGroup;

    public AWTExample() {
        frame = new Frame("AWT Controls Example");

        // Choice control
        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.setBounds(50, 50, 100, 30);

        // Button control
        button = new Button("Click Me!");
        button.setBounds(200, 50, 80, 30);

        // Checkbox controls
        checkboxGroup = new CheckboxGroup();
        checkbox1 = new Checkbox("Checkbox 1", checkboxGroup, false);
        checkbox2 = new Checkbox("Checkbox 2", checkboxGroup, false);
        checkbox1.setBounds(50, 100, 100, 30);
        checkbox2.setBounds(50, 150, 100, 30);

        // Registering event listeners
        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Selected option: " + choice.getSelectedItem());
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox 1 selected: " + checkbox1.getState());
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox 2 selected: " + checkbox2.getState());
            }
        });

        // Adding controls to the frame
        frame.add(choice);
        frame.add(button);
        frame.add(checkbox1);
        frame.add(checkbox2);

        // Setting frame size and layout
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setVisible(true);

        // Handling window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
