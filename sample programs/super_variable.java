/*class A
{
//int a=10;
}
class B extends A
{
int a= 20;
void show(){
System.out.println(a);
//System.out.println(super.a);
}
   }
   class super_variable{
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
   }
*/
class A{
    A(int a)
    {
        System.out.println("satyam"+a);
    }
}
class B extends A{

     B()
    {
        super.show();
        System.out.println("chaudhary");
    }

}
class super_variable
{
    public static void main(String[] args) {
        B r=new B();

    }
}




