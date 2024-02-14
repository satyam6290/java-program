import javax.swing.*;
import java.awt.*;

public class DrawingExample extends JFrame {
    public DrawingExample() {
        super("Drawing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        //setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw a circle
        g.setColor(Color.RED);
        g.fillOval(100, 100, 100, 100);

        // Draw an ellipse
        g.setColor(Color.BLUE);
        g.fillOval(250, 100, 150, 100);

        // Draw a rectangle
        g.setColor(Color.GREEN);
        g.fillRect(100, 250, 200, 100);
    }

    public static void main(String[] args) {
        DrawingExample example = new DrawingExample();
    }
}
