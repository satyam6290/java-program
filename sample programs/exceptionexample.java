public class exceptionexample {
    public static void main(String[] args) {
        int a= 10;
        int b=0;
        int result=0;
        
        
        try{
            
            System.out.println(result);
        }
        
        catch(ArithmeticException e)

        {
            System.out.println("something went wrong"+e);
        }
        catch(Exception s){
            System.out.println("stay in your limits");
        }
     
        System.out.println("bye");
    }
}
