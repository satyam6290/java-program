import java.util.Arrays;
public class arr2 {
  public static void main(String[] args) {
    String a[]={"say","hello","to","everyone"};
    System.out.println("to string"+Arrays.toString(a));
    System.out.println("aslist"+Arrays.asList(a));
    int arr[][]={{1,2,3},{4,5,6}};
    System.out.println("deepString"+Arrays.deepToString(arr));
  }  
}
