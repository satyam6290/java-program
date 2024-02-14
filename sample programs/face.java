/*Java Program to Draw a Human Face using Applet*/
import java.applet.*;
import java.awt.*;
public class face extends Applet
{ 
    //Initialize the applet
    public void init()
    {
	setBackground(Color.white);
    }
    //Draw the human face
    public void paint(Graphics g) 
    { 
        //Change color to cream
        Color clr=new Color(255,179,86);
        g.setColor(clr);
        //Draw and fill the face
        g.drawOval(100,100,250,300);
        g.fillOval(100,100,250,300);
        //Change color to black
        g.setColor(Color.black);
        //Draw the left eye
        g.drawOval(160,185,40,25);
        g.fillOval(160,185,40,25);
        //Draw the right eye
        g.drawOval(250,185,40,25);
        g.fillOval(250,185,40,25);
        //Draw the Left Eyebrow
        g.drawArc(160,170,35,10,0,180);
        //Draw the Right Eyebrow
        g.drawArc(250,170,35,10,0,180);
        //Draw the Nose
        g.drawLine(210,265,210,275);
        g.drawLine(240,265,240,275);
        g.drawArc(210,275,30,10,0,-180); 
       //Draw the smile
        g.drawArc(175,300,100,50,0,-180);
    } 
} 
/*
<applet code = Human_Face.class width=500 height=500>
</applet>
*/


/*import java.io.*;
import java.net.*;\\\\\\\\\\\
import java.util.*;

import javax.xml.transform.Source;

import java.io*;
class base
{
    int x;
    base(int x)
{
    thiss.x;

}
void display()
{
    System.out.println(x);
}
}
class derived extends base{
    int y;
    derived(int x,int y)
    {
        super(x);
        this.y=y;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
}
class overriding
{
    public static void main(String[] args) {
        derived d = new derived(100,200);
        d.display();
    }
}

package arithmetic;
public class arithclass
{
    public int add(int a,int b)
{
    return(a+b);
}
public int sub(int x,int y)
{
    return(x-y);
}
public int mul(int s,int t)
{
    return(s*t);
}
}
class arith
import arithmetic.arithclass{
    class arithclas{
        public static void main(String[] args) {
            arithclass a = new arithclass();
            int c=a.add(10,20);
            System.out.println("add:"+c);
            int d=a.sub(20,5);
            System.out.println("sub:"+c);
            int e=a.mul(10,5);
            System.out.println("mul:"+e);
        }
}
import java.io*;
class number{
    public static void main(String[] args)throws IOException {
      DataInputStream dis = new DataInputStream(System.in);
      int num,digit=0;
      try{
        System.out.println("enter the string:");
        num=Integer.parseInt(dis.readLine());
        while(num>0)
        {
            digit++;
            num=(num/10);

        }
        System.out.println("number of digits:"+digits);
      }  
      catch(NumberFormatException e)
      {
        System.out.println("invalid");
      }
    }
}


import java.io.*;
class number{
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        int num,digit=0;
        try{
            
        }
    }
}
*/
import java.applet.*;
import java.awt.*;
public class face extends applet{
    public void init{
        setBackground(color.white)
    }
    public void paint(Graphics g)
    {
        g.drawOval(100,100,250,300);
        g.fillOval(100,100,250,300);

        // draw left eye
        g.drawOval(160,185,40,25);
        g.fillOval(160,185,40,25);
        // draw  right eye
        g.drawOval(250,185,40,25);
        g.fillOval(250,185,40,25);
        // draw left eyebrow
        g.drawArc(160,170,35,10,0,180);
        //draw right eyebrow
        g.drawArc(250,170,35,10,0,180);
        // draw nose
        g.drawLine(250,265,210,275)
        g.drawLine(240,265,210,275)
        g.drawArc(210,275,35,10,0,-180);
        // draw mouth
        g.drawArc(175,300,100,50,0,-180)
    }
}
/* <applet code ="face" width=500 height 500>
 * </applet>
 */















 
  



























