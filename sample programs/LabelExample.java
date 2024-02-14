import javax.swing.*;

public class LabelExample extends JFrame {
    public LabelExample() {
        super("Label Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Hello, world!");
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        LabelExample example = new LabelExample();
    }
}
