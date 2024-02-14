  import java.io.*;
  public class console{
    public static void main(String args[]){
    String str;
    char ch[];
    console obj=System.console();
    System.out.print("enter username:");
    str=obj.readLine();
    System.out.print("enter password:");
    ch=obj.readPassword();
    System.out.println("username:"+str);
    System.out.println("password:"+ch);
    }
    }