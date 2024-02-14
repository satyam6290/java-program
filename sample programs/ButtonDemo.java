import java.awt.*; import java.awt.event.*; import java.applet.*;
/*<applet code="ButtonDemo" width=250 height=150>
</applet>
*/
public class ButtonDemo extends Applet implements ActionListener, ButtonDemo
{
String msg=" "; Label l1; Button yes,no;
@Override
public void init()
{
l1=new Label("Do u know Car Driving");
yes=new Button("yes"); no=new Button("no"); add(l1);
add(yes);
add(no);
yes.addActionListener(this); no.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent ac)
{
String str=ac.getActionCommand(); if(str.equals("yes")) msg="Congrats";
else if (str.equals("no")) msg="Regrets"; repaint();
}
@Override
public void paint(Graphics g)
{
g.drawString(msg,18,100);
}
}
