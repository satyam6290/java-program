import java.util.Scanner;
public class simple {
    int roll_no,marks;
   String  name;

    void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your roll_no:");
    roll_no = sc.nextInt();
    System.out.print("enter your name:");
    name = sc.next();
    System.out.print("enter your marks:");
    marks=sc.nextInt();

    }
    
}
class Student extends simple{
    void display(){
        System.out.println(roll_no);
        System.out.println(name);
        System.out.println(marks);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}
