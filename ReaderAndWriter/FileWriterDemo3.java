package ReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWriterDemo3
{
    public static void main(String[] args) throws IOException {
        Map<Integer,String> map=new HashMap<>();
        map.put(11,"Harish");
        map.put(12,"Sandeep");
        map.put(13,"Charan");
        FileWriter fw=new FileWriter("file4.csv");
        for (int id:map.keySet()) {
            String name=map.get(id);
            fw.write(id+"  "+name);
            fw.write(System.lineSeparator());
        }
        fw.close();
        System.out.println("Map content has been written to the file");
    }
}
