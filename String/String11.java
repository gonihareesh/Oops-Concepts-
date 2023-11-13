package StringPractice;

import java.util.Scanner;
//Maximum and minimum Word in the String
public class String11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String");
        String input = s.nextLine();
        System.out.println("Input: " + input);
        String[] words = input.split(" ");
        String maxword = words[0];

        for (int i = 0; i < words.length; i++) {
            if (maxword.length() < words[i].length())
                maxword = words[i];

        }
        System.out.println("Maximum word of the String is :" + maxword);
        String minWord=words[1];
        for(int i=0;i< words.length;i++){
            if(minWord.length()>words[i].length()){
                minWord=words[i];
            }
        }
        System.out.println("minimum word of String is :"+minWord);
        s.close();
    }
}
