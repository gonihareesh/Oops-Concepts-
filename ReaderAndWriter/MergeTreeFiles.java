package ReaderAndWriter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeTreeFiles
{
    public static void main(String[] args) throws IOException {
        // first file creation
        Map<Integer, String> map = new HashMap<>();
        map.put(01, "krishna");
        map.put(02, "hari krishna");
        map.put(03, "kishor");
        map.put(04, "anil kumar");
        BufferedWriter bw = new BufferedWriter(new FileWriter("file10.csv"));
        bw.write("id,name\n");
        for (int id : map.keySet()) {
            String name = map.get(id);
            bw.write(id + "," + name);
            bw.newLine();
        }
        bw.close();
        System.out.println("file has been created");
        // second file...
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(01, "krishna.ch@gmail.com");
        map1.put(02, "harikrishna5553@gmail.com");
        map1.put(03, "kishor.kumar123@gmail.com");
        map1.put(04, "anil.mothukuri555@gmail.com");
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("file11.csv"));
        bw2.write("id,email\n");
        for (int id : map1.keySet()) {
            String email = map1.get(id);
            bw2.write(id + "," + email);
            bw2.newLine();
        }
        bw2.close();
        System.out.println("second file is created");
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(01, 10000);
        map2.put(02, 15000);
        map2.put(03, 20000);
        map2.put(04, 25000);
        BufferedWriter bw3 = new BufferedWriter(new FileWriter("file12.csv"));
        bw3.write("id,salary\n");
        for (int id : map2.keySet()) {
            int salary = map2.get(id);
            bw3.write(id + "," + salary);
            bw3.newLine();
        }
        bw3.close();
        System.out.println("third file is created...");
        //

        BufferedReader br = new BufferedReader(new FileReader("file10.csv"));
        BufferedReader br1 = new BufferedReader(new FileReader("file11.csv"));
        BufferedReader br2 = new BufferedReader(new FileReader("file12.csv"));
        String line = new String();
        String text1 = new String();
        String text2 = new String();
        String text3 = new String();
        while ((line = br.readLine()) != null) {
            text1 += line + "\n";

        }
        text1 = text1.substring(0, text1.lastIndexOf("\n"));
        while ((line = br1.readLine()) != null) {
            text2 += line + "\n";
        }
        text2 = text2.substring(0, text2.lastIndexOf("\n"));
        while ((line = br2.readLine()) != null) {
            text3 += line + "\n";

        }
        text3 = text3.substring(0, text3.lastIndexOf("\n"));
        br.close();
        br1.close();
        br2.close();
        String text4 = text1 + "\n" + text2 + "\n" + text3;
        BufferedWriter bwrite = new BufferedWriter(new FileWriter("de.csv"));
        bwrite.write(text4);
        System.out.println("file iscreated.....");
        bwrite.flush();
        bwrite.close();

        BufferedReader br4=new BufferedReader(new FileReader("de.csv"));
        String print;
        while((print=br4.readLine())!=null){
            System.out.println(print);
        }
        br4.close();
    }

}
