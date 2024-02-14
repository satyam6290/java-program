class A {
    int x,y;
    A(int a,int b)
    {
x=a;
y=b;
    }
    A(int a,String b){
        System.out.println(a+" "+b);

    }
    void show(){
        System.out.println(x+" "+y);

    }
    class abcd{
        public static void main(String[] args) {
            A a=new A(100,200);
            a.show();
            A  r=new A(100,"satyam");

        }
    }
}
