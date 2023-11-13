package StringPractice;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String input = s.nextLine();
        System.out.println("input:" + input);
        String reverse = "";
        int rev = input.length();
        for (int i = rev - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (input.equalsIgnoreCase(reverse)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not palindrome");
        }
        s.close();
    }
}
