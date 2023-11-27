package ReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BufferedWriterDemo2
{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("file6.csv"));
        Set<String> s=new HashSet<>();
        s.add("java");
        s.add("Python");
        s.add("PHP");
        s.add("Devops");
        for (String subject:s) {
            bw.write(subject);
            bw.newLine();
        }
        bw.close();
        System.out.println("Set content has been saved..");

    }
}
