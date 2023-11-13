package StringPractice;

import java.util.Scanner;
//count the number of words in a string
public class String2 {
    public static void main(String[] args) {
        System.out.println("enter the String ");
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        System.out.println("String is:" + data);
        String[] words = data.split(" ");
        System.out.println(words.length);
    }
}
