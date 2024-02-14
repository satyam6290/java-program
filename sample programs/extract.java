import java.io.*;

public class extract {
    public static void main(String[] args)throws IOException
     {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("enter the string:");
        String s=dis.readLine();
        System.out.println("the the starting portion of the string:");
        int n=Integer.parseInt(dis.readLine());
        System.out.println("enter the ending portion of the string:");
        int m=Integer.parseInt(dis.readLine());
        String s1;
        StringBuffer sb= new StringBuffer(s);
        s1=sb.substring(m, n);
        System.out.println("the extracted portion is:"+s1);
        sb.delete(m, n);
        System.out.println("the remaining  portion is:"+sb);

    }
}
