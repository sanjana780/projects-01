import javax.swing.*;
import java.awt.*;

class LayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel with FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));
        flowPanel.add(new JButton("Button 4"));

        // Create a panel with BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // Add panels to the frame
        frame.getContentPane().add(flowPanel, BorderLayout.NORTH);
        frame.getContentPane().add(borderPanel, BorderLayout.CENTER);

        // Set the frame visible
        frame.setVisible(true);
    }
}

