import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public MyFrame() {
        // Set up the JFrame
        setTitle("My Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the JButton
        button = new JButton("Click me!");
        button.addActionListener(this);

        // Set up the JLabel
        label = new JLabel();

        // Add the components to the JFrame
        add(button, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        // Show the JFrame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle the button click event
        if (e.getSource() == button) {
            label.setText("Button clicked!");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the MyFrame class
        new MyFrame();
    }
}
