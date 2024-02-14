
    /*mport javax.swing.*;
    import java.awt.*;
    
    public class ButtonExample {
       public static void main(String[] args) {
          JFrame frame = new JFrame("Button Example");
          frame.setSize(400, 200);
          frame.setLayout(new GridLayout(2, 4));
    
          JButton button1 = new JButton("Button 1");
          JButton button2 = new JButton("Button 2");
          JButton button3 = new JButton("Button 3");
          JButton button4 = new JButton("Button 4");
          JButton button5 = new JButton("Button 5");
          JButton button6 = new JButton("Button 6");
          JButton button7 = new JButton("Button 7");
          JButton button8 = new JButton("Button 8");
    
          frame.add(button1);
          frame.add(button2);
          frame.add(button3);
          frame.add(button4);
          frame.add(button5);
          frame.add(button6);
          frame.add(button7);
          frame.add(button8);
    
          frame.setVisible(true);
       }
    }*/
    import java.awt.GridLayout;

import javax.swing.*;

public class ButtonExample {

   public static void main(String[] args) {
      // Create a JFrame and set its properties
      JFrame frame = new JFrame("Button Example");
      frame.setSize(300, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create 8 buttons and add them to the JFrame
      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("Button 3");
      JButton button4 = new JButton("Button 4");
      JButton button5 = new JButton("Button 5");
      JButton button6 = new JButton("Button 6");
      JButton button7 = new JButton("Button 7");
      JButton button8 = new JButton("Button 8");
      
      frame.getContentPane().add(button1);
      frame.getContentPane().add(button2);
      frame.getContentPane().add(button3);
      frame.getContentPane().add(button4);
      frame.getContentPane().add(button5);
      frame.getContentPane().add(button6);
      frame.getContentPane().add(button7);
      frame.getContentPane().add(button8);
      
      // Set the layout to a grid with 2 rows and 4 columns
      frame.getContentPane().setLayout(new GridLayout(2, 4));
      
      // Show the JFrame
      frame.setVisible(true);
   }
}

        

