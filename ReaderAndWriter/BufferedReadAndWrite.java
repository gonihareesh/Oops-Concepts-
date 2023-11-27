package ReaderAndWriter;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class BufferedReadAndWrite
{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("file7.csv"));
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(12345,"Hyderabad");
        map.put(23145,"Pune");
        map.put(23458,"Bangalore");
        map.put(23897,"Chennai");
        bw.write("pincode,city\n");
        for (int pincode:map.keySet()) {
            String city=map.get(pincode);
            bw.write(pincode+" "+city);
            bw.newLine();
        }
        bw.close();
        System.out.println("Mapping content has saved..");
        Map<String,String> map1=new LinkedHashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("file7.csv"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
