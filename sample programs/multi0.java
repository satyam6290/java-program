 import java.util.Scanner; 
class multi0 {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
         System.out.print("enter the value of a:");
           a = sc.nextInt();
        System.out.print("enter the value of b:");
          b = sc.nextInt();
    
    
    void add(){
       
        c=a+b;
        System.out.println("sum: "+c);
    }
    void sub(){
       
        c=a-b;
        System.out.println("sub: "+c);
    }
    
}
class multi2 extends multi0{
    void mul(){
      
        c=a*b;
        System.out.println("mul: "+c);
    }
    void div(){
      
        c=a/b;
        System.out.println("div: "+c);
    }
}
class multi3 extends multi2{
    void rem(){
     
        c=a%b;
        System.out.println("rem: "+c);
    }
    
}
class multi{
    public static void main(String[] args) {
        
    
        multi3 m=new multi3();
                   m.add();
                   m.sub();
                   m.mul();
                   m.div();
                   m.rem();
           
       }
}
