/*
public class reversestring {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("satyam chaudhary");
        System.out.println(s.reverse());
        StringBuilder sa = new StringBuilder("shivam chaudhary");
        System.out.println(sa.reverse());
    }
}
*/
public class reversestring{

    public static void main(String[] args) {
        int l,i;
        String s="satyam chaudhary";
        String ss ="";

        l=s.length();
        //using for loop
        for (i=l-1;i>=0;i--){
            ss=ss+s.charAt(i);
            System.out.println(ss);

            
        }
    }
}