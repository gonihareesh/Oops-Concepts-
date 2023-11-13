package StringPractice;

import java.util.Scanner;
//in string 1 are present in string 2, then it should be printed as such in output, else '+' should be printed in output
public class String12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first String");
        String input1 = s.nextLine();
        System.out.println("input1:" + input1);
        System.out.println("enter the second String");
        String input2 = s.nextLine();
        System.out.println("input2:" + input2);
        String output = " ";
        for (int i = 0; i < input1.length(); i++) {
            char temp = input1.toLowerCase().charAt(i);
            if (input2.toLowerCase().indexOf(temp) >= 0)
                output += input1.charAt(i);
            else
                output += "+";

        }
        System.out.println("Output:" + output);
        s.close();

    }
}
