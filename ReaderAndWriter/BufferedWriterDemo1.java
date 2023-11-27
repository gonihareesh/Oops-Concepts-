package ReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1
{
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("file2.csv");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("this is bufferedWriter");
        bw.write("bufferedWriter is the best for character Stream");
        bw.newLine();
        bw.close();
        System.out.println("content has been written to the file");
    }
}
