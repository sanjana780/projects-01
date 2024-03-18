import javax.swing.*;
import java.awt.*;

public class StudentInformationFrame extends JFrame {
    private JLabel nameLabel, ageLabel, gradeLabel;
    private JTextField nameField, ageField, gradeField;
    private JButton submitButton;

    public StudentInformationFrame() {
        // Set frame properties
        setTitle("Student Information");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Create labels
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        gradeLabel = new JLabel("Grade:");

        // Create text fields
        nameField = new JTextField();
        ageField = new JTextField();
        gradeField = new JTextField();

        // Create submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> displayInformation());

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(gradeLabel);
        add(gradeField);
        add(submitButton);

        // Set frame visible
        setVisible(true);
    }

    private void displayInformation() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String grade = gradeField.getText();

        String message = "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Grade: " + grade;

        JOptionPane.showMessageDialog(this, message, "Student Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentInformationFrame::new);
    }
}
