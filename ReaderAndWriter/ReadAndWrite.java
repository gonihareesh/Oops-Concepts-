package ReaderAndWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        Vector<String> v=new Vector<>();
        v.add("one\n");
        v.add("Two\n");
        v.add("Three\n");
        v.add("four\n");
        FileWriter fw=new FileWriter("file.csv");
        for (String num:v) {
            fw.write(num);
        }
        fw.close();
        System.out.println("Vector content has been written to the file");

       FileReader fr=new FileReader("file.csv");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
