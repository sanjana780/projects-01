import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathCalculator extends JFrame implements ActionListener {
    private JTextField number1TextField, number2TextField, resultTextField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public MathCalculator() {
        // Set up the JFrame
        setTitle("Math Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Create and add components
        JLabel number1Label = new JLabel("Number 1:");
        number1TextField = new JTextField();
        add(number1Label);
        add(number1TextField);

        JLabel number2Label = new JLabel("Number 2:");
        number2TextField = new JTextField();
        add(number2Label);
        add(number2TextField);

        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField();
        resultTextField.setEditable(false);
        add(resultLabel);
        add(resultTextField);

        addButton = new JButton("Add");
        addButton.addActionListener(this);
        add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(this);
        add(subtractButton);

        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        // Display the JFrame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double number1 = Double.parseDouble(number1TextField.getText());
        double number2 = Double.parseDouble(number2TextField.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = number1 + number2;
        } else if (e.getSource() == subtractButton) {
            result = number1 - number2;
        } else if (e.getSource() == multiplyButton) {
            result = number1 * number2;
        } else if (e.getSource() == divideButton) {
            result = number1 / number2;
        }

        resultTextField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MathCalculator();
            }
        });
    }
}
