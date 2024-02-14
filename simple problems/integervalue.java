import java.io.*;
import java.util.*;

//driver class
class integervalue{
    public static void main(String[] args) {
        
        //declare integer
        int num;

        //taking input fron user
        System.out.println("enter the integer");

        //create scaner class
        Scanner s = new Scanner(System.in);

        //storing integer
        num=s.nextInt();

        //displaying
        System.out.println("entered integer is: "+num);
    }
}