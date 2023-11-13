package StringPractice;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
//count of uppercase letters, lowercase letters, digits and special characters in a given string.
public class String8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String");
        String input = s.nextLine();
        System.out.println("input:" + input);
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int specialCharacterCount = 0;
        int numberCount = 0;
        char[] character = input.toCharArray();//converting this String to char Array
        for (char ch : character) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;

            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else
                specialCharacterCount++;
        }

        System.out.println("Output:");
        System.out.println("upper Case Count:" + upperCaseCount);
        System.out.println("lower case count:" + lowerCaseCount);
        System.out.println("special count:" + specialCharacterCount);
        System.out.println("number counts:" + numberCount);
    }
}
