package StringPractice;

import java.util.Scanner;
//to print the filename extension in the console
public class String14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the file name with extension");
        String input1 = s.nextLine();
        System.out.println("enter second file ");
        String input2 = s.nextLine();
        System.out.println("Input:" + input1);
        System.out.println("input:" + input2);
        String output = input1.substring(input1.lastIndexOf(".") + 1, input1.length());
        String output2 = input2.substring(input2.lastIndexOf(".") + 1);
        System.out.println("first file extension: " + output);
        System.out.println("second file extension: " + output2);

    }
}
