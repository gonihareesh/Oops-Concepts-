package ReaderAndWriter;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharacterArrayfile
{
    public static void main(String[] args) throws IOException {
        char[] ch = { 'k', 'r', 'i', 's', 'h', 'n', 'a' };
        CharArrayReader chr = new CharArrayReader(ch);
        int a;
        while ((a = chr.read()) != -1) {
            char c = (char) a;
            System.out.print(c + ":");
            System.out.println(a);
        }

    }
}
