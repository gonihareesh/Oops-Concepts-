package ReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo
{
    public static void main(String[] args) throws IOException {
        Writer w=new FileWriter("file2.txt");
        w.write("Hi\n");
        w.write("How are you\n");
        w.write("welcome to the coding world.\n");
        w.close();
    System.out.println("file created..");
    }
}
