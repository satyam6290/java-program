import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseClick extends JFrame {
   private JButton myButton;
   
   public MouseClick() {
      super("My Button");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      myButton = new JButton("Click Me!");
      add(myButton);
      myButton.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent event) {
            JOptionPane.showMessageDialog(MouseClick.this, "You clicked the button!");
         }
      });
      setSize(300, 100);
      setVisible(true);
   }

   public static void main(String[] args) {
      MouseClick myButton = new MouseClick();
   }
}
