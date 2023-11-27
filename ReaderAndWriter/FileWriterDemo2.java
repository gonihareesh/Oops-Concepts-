package ReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriterDemo2
{
    public static void main(String[] args) throws IOException {
        ArrayList<String> al=new ArrayList<>();
        al.add("this file is created using ArrayList\n");
        al.add("this is csv file..\n");
        FileWriter fw=new FileWriter("file3.csv");
        for (String lines:al) {
            fw.write(lines);
        }
        fw.close();
        System.out.println("ArrayList content has been written to the file");

    }
}
