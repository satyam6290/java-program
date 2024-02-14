import javax.swing.*;

public class TextFieldExample extends JFrame {
    public TextFieldExample() {
        super("Text Field Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
JButton button=new JButton("satyam1");
add(button);
JButton button1=new JButton("satyam2");
add(button1);
JButton button2=new JButton("satyam3");
add(button2);
JButton button3=new JButton("satyam4");
add(button3);
JButton button4=new JButton("satyam5");
add(button4);
JButton button5=new JButton("satyam6");
add(button5);
JButton button6=new JButton("satyam7");
add(button6);


        setVisible(true);
    }

    public static void main(String[] args) {
        TextFieldExample example = new TextFieldExample();
    }
}
