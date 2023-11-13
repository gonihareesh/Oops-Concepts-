package StringPractice;

import java.util.Arrays;
import java.util.Scanner;
//create an array using words at odd positions in a string
public class String10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String ");
        String input = s.nextLine();
        System.out.println("input:" + input);
        String[] words = input.split(" ");
        String[] outputArr = new String[words.length / 2];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                outputArr[index] = words[i];
                index++;
            }
        }
        System.out.println("output:" + Arrays.toString(outputArr));
        s.close();
    }
}
