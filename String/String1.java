package StringPractice;

import java.util.Scanner;
//length of the string
public class String1 {
    public static void main(String[] args) {
        System.out.println("enter the String ");
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        System.out.println("length of the String is:" + data.length());
    }
}
