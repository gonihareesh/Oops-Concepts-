package StringPractice;

import java.util.Scanner;
//count the total number of occurrences of a given character in a string
public class String3 {
    public static void main(String[] args) {
        System.out.println("enter the string ");
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        System.out.println("enter the targeted character");
        char target = s.next().charAt(0);
        System.out.println("data:" + data);
        System.out.println("target character:" + target);
        // Case1:code for targeted character in String...
          int count = 0;
          for (int i = 0; i < data.length(); i++) {
          if (data.charAt(i) == target)
          count++;
         }
        System.out.println("Output:" + count);

    }
}