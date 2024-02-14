//java program to demonstrate bufferedreader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreader {
  public static void main(String[] args)throws IOException {
    
    //enter data using bufferedreader
    BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));

    //reading data using ReadLine
    String name = bs.readLine();

    //printing the read line
    System.out.println("enterd string is: "+name);
  }  
}
