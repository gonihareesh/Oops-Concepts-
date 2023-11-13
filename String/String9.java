package StringPractice;

import java.util.Scanner;
//to find the first repeated and non-repeated character in the given string
public class String9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the input");
        String input = s.nextLine();
        char mostRepetedCharacter = ' ';
        char nonRepetedCharacter = ' ';
        for (int i = 0; i < input.length(); i++) {
            char tempCharacter = input.charAt(i);
            if (tempCharacter != ' ') {
                if (input.indexOf(tempCharacter) == input.lastIndexOf(input)) {
                    if (nonRepetedCharacter == ' ')
                        nonRepetedCharacter = tempCharacter;
                } else if (mostRepetedCharacter == ' ')
                    mostRepetedCharacter = tempCharacter;
                if (nonRepetedCharacter != ' ' && mostRepetedCharacter != ' ')
                    break;
            }
        }
        System.out.println("OUTPUT:");
        System.out.println("nonrepeted character:" + nonRepetedCharacter);
        System.out.println("repeted character:" + mostRepetedCharacter);

        s.close();
    }
}
