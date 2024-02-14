

abstract class Animal
{
 Animal()
 {
    System.out.println("all are animals");
 }
public abstract void sound();

}
class dog extends Animal{
dog()
{
    super();
}
public void sound()
{
    System.out.println("dogs are barking");
}

}
class lion extends Animal{
lion(){
super();
}
public void sound()
{
    System.out.println("lion are roaring");
}
}
 class test {
    public static void main(String[] args) {
        dog d= new dog();
        
        d.sound();
        lion l = new lion();
        l.sound();
    

    }
 }
