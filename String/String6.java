package StringPractice;

import java.util.Scanner;
//reverse each word of a given string
public class String6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String");
        String input = s.nextLine();
        System.out.println("input:" + input);
        String word[] = input.split(" ");
        String output = "";
        for (int i = 0; i < word.length; i++) {
            String words = word[i];

            String reverseword = getReverseString(words);

            if (i != word.length - 1) {
                output += reverseword + " ";
            } else
                output += reverseword;
        }
        System.out.println("output:" + output);
    }

    private static String getReverseString(String words) {
        String reverseWord = "";
        for (int j = words.length() - 1; j >= 0; j--) {
            reverseWord += words.charAt(j);
        }
        return reverseWord;

    }

}
