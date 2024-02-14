import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find factorial:");
        int n=sc.nextInt();
        fact f = new fact();
        int result = f.fact(n);
        System.out.println("the factorial of given number is:"+result);
    }
    int fact(int n){
        if(n==1)
        return 1;
        else 
            return n*fact(n-1);
        

    }

    
}
