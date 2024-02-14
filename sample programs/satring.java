public class satring {
    
    public static void main(String[] args) {
        String s= "SATYAM";
        String str = new String("shivam");
        System.out.println(s.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(s.equals(str));
        System.out.println(s.length());

         String a="   kumar  ";
         String b="chaudhary";
        System.out.println(a.trim());
        System.out.println(b.isEmpty());
        System.out.println(s.concat(a));
        System.out.println(a.charAt(3));
        System.out.println(b.indexOf('h'));
        System.out.println(b.replace('a', 'o'));

    }
}
