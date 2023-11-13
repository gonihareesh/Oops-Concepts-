package StringPractice;

import java.util.Scanner;
//reverse String ...
public class String5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String");
        String input = s.nextLine();
        System.out.println("Input:" + input);
        // String words[]=input.split(" ");
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);
        }
        System.out.println("reverse String is:" + reverseString);
        s.close();
    }
}
