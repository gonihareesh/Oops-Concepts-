package ReaderAndWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class MergDemo
{
    public static void main(String[] args) throws IOException {
        Vector<String> v = new Vector<>();
        v.add("hello \n");
        v.add("how are you \n");
        v.add("how was the day \n");
        File f = new File("file3.txt");
        BufferedWriter br = new BufferedWriter(new FileWriter(f));
        for (String n : v) {
            br.write(n);
            System.out.println("file created...");
        }
        br.close();
        ArrayList<String> al = new ArrayList<>();
        al.add("i love java \n");
        al.add("i want to become good software engineer");
        File f1 = new File("file4.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
        for (String m : al) {
            bw.write(m);
            System.out.println("file4 created...");
        }
        bw.close();
        File file = new File("file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file));
        File file1 = new File("file4.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(file1));
        String line = new String();
        String text1 = new String();
        String text2 = new String();
        while ((line = br1.readLine()) != null) {
            text1 += line + "\n";
            System.out.println(text1);
        }
        text1 = text1.substring(0, text1.lastIndexOf("\n"));
        while ((line = br2.readLine()) != null) {
            text2 += line + "\n";
            System.out.println(text2);
        }
        text2 = text2.substring(0, text2.lastIndexOf("\n"));
        br1.close();
        br2.close();
        String text3 = text1 + "\n" + text2;
        File file3 = new File("./file5.txt");
        BufferedWriter w = new BufferedWriter(new FileWriter(file3));

        w.write(text3);
        System.out.println("file5 created....");
        w.flush();
        w.close();
        System.out.println("----");
        BufferedReader br3 = new BufferedReader(new FileReader("./file5.txt"));
        String print = new String();
        while ((print = br3.readLine()) != null) {
            System.out.println(print);
        }
        br3.close();
    }
}
