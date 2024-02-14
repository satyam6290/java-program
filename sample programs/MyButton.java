import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyButton extends JFrame implements ActionListener {
   private JButton myButton;
   
   public MyButton() {
      super("My Button");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      myButton = new JButton("Click Me!");
      add(myButton);
      myButton.addActionListener(this);
      setSize(300, 100);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent event) {
      JOptionPane.showMessageDialog(this, "You clicked the button!");
   }
   
   public static void main(String[] args) {
      MyButton myButton = new MyButton();
   }
}
