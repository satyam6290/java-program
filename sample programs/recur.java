public class recur {
    

int sum(int b)
{
    if(b>0)
    {
        return b+sum(b-1);

    }
    else{
        return 0;

    }
}
public static void main(String[] args) {
    recur rc = new recur();
    int a=rc.sum(10);
    System.out.println("the sum of n number is:"+a);
}
}
