import java.io.*;
class room                                                                                                                                                                                                                                                                                                                                                                                                                      {
    int l,b;
    room(int x,int y)
    {
        l=x;
        b=y;
    }
    room(int x)
    {
        l=b=x;
    }
    int area()
    {
        return(l*B);
    }
}
class overloading{
    public static void main(String[] args) {
        room r1=new room(25,15);
        System.out.println("area"+r1.area());
        room r2 = new roon(25);
        System.out.println("area"+r2.area());
    }
}
