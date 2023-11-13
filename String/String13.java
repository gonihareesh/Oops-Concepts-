package StringPractice;

import java.util.Scanner;
//first name and last name, print the last name first then followed by "," and first character of the first name
public class String13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the first String");
        String first = s.nextLine();
        System.out.println("input1:" + first);
        System.out.println("enter the second String");
        String last = s.nextLine();
        System.out.println("input2:" + last);
        String output = last + "," + first.charAt(0);
        System.out.println("Output:" + output);
        s.close();
    }
}