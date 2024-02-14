

import java.io.*;
 class base{
    int x;
    base(int x)
    {
        this.x=x;

    }
    void display()
    {
        System.out.println("base x="+x);
    
    }
}
class derived extends base
{
    int y;
    derived(int x,int y)
    {
        super(x);
        this.y=y;

    }
    void display()
    {
        System.out.println("derived x="+x);
        System.out.println("derived u="+y);
    }
}
 public class overriding{
    public static void main(String[] args) {
        derived d = new derived(100,10);
        d.display();
    }
}