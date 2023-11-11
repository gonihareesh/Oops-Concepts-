package String;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "hare krishna hare krishna krishna krishna hare hare";
       String s1 = "hare rama hare rama rama rama hare hare";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(" ----------------");
        System.out.println(s.length());
        System.out.println(s1.length());
        System.out.println(s.charAt(26));
         //System.out.println(s.compareTo(s1));
        System.out.println(s.concat("\n" + s1));
        // System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.startsWith("hare"));
        System.out.println(s.endsWith("hare hare"));
        System.out.println(s.substring(5, 42));
        System.out.println(s.toUpperCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.endsWith("hare"));
       // System.out.println(s.split("krishna")); 
       

    }

}
