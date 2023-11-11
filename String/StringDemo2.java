package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = new String("hello");
        System.out.println(s + 1 + 2 + 3);
        System.out.println(1 + s + 2 + 3);
        System.out.println(1 + 2 + s + 3);
        System.out.println(1 + 2 + 3 + s);
        System.out.println((1 + 2) + s + 3);
        System.out.println(1 + s + (2 + 3));
    }

}
