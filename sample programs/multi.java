public class multi {
    int a,b,c;
    void add(){
        a=10;
        b=20;
        c=a+b;
        System.out.println("sum: "+c);
    }
    void sub(){
        a=100;
        b=20;
        c=a-b;
        System.out.println("sub: "+c);
    }
    
}
class multi2 extends multi{
    void mul(){
        a=10;
        b=20;
        c=a*b;
        System.out.println("mul: "+c);
    }
    void div(){
        a=100;
        b=20;
        c=a/b;
        System.out.println("div: "+c);
    }
}
class multi3 extends multi2{
    void rem(){
        a=100;
        b=20;
        c=a%b;
        System.out.println("rem: "+c);
    }
}
class test{
    public static void main(String[] args) {
        multi3 m=new multi3();
        m.add();
        m.sub();
        m.mul();
        m.div();
        m.rem();

    }
}
