import java.util.Scanner;
class fun
{
    int num1,num2,add,sub,mul,div,rem;
    void input(){
Scanner sc = new Scanner(System.in);
     System.out.println("enter the value of num1");
     num1=sc.nextInt();
     System.out.println("enter the value of num2");
     num2=sc.nextInt();
    }
    class fun1 extends fun{
    void process(){
        add=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        rem=num1%num2;

    }
}
class fun2 extends fun1{
    void output(){
        System.out.println("sum of two number is:"+add);
        System.out.println("sub of two number is:"+sub);
        System.out.println("mul of two number is:"+mul);
        System.out.println("div of two number is:"+div);
        System.out.println("rem of two number is:"+rem);
    }
    
    public static void main(String[] args) {
        fun2 f=new fun2();
        f.input();
        f.process();
        f.output();
        
        
    }
}