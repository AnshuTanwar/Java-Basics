import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Student {
    String name;
    int age;
    int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nRoll Number: " + rollNumber;
    }
}

public class StudentDetailsApp extends JFrame {
    private JLabel nameLabel, ageLabel, rollNumberLabel;
    private JTextField nameField, ageField, rollNumberField;
    private JButton displayButton;

    public StudentDetailsApp() {
        setTitle("Student Details");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        rollNumberLabel = new JLabel("Roll Number:");

        nameField = new JTextField();
        ageField = new JTextField();
        rollNumberField = new JTextField();

        displayButton = new JButton("Display Details");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayDetails();
            }
        });

        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(rollNumberLabel);
        add(rollNumberField);
        add(displayButton);

        setVisible(true);
    }

    private void displayDetails() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        int rollNumber = Integer.parseInt(rollNumberField.getText());

        Student student = new Student(name, age, rollNumber);

        
        JOptionPane.showMessageDialog(this, student.toString(), "Student Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentDetailsApp();
            }
        });
    }
}
