import java.util.Scanner;
  
  class nestifexample{
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age:");

        int age =sc.nextInt();
    String gender = "male";
    if (age > 18) {
        // person is an adult
        if (gender == "male") {
        // person is a male
        System.out.println(
            "You can shop in the men's section on the 3rd Floor"
        );
        } else {
        // person is a female
        System.out.println("You can shop in the women's section on 2nd Floor");
        }
    } else {
        // person is not an adult
        System.out.println("You can shop in the kid's section on 1st Floor");
    }
    }}