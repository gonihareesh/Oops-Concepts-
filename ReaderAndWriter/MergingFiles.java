package ReaderAndWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MergingFiles
{
    public static void main(String[] args) throws IOException {

        ArrayList<String> al=new ArrayList<>();
        al.add("Krishna");
        al.add("rama");
        al.add("Narayana");
        al.add("Narasimha");
        BufferedWriter bw=new BufferedWriter(new FileWriter("file7.txt"));
        for(String name:al){
            bw.write(name);
            bw.newLine();
        }
        bw.close();
        System.out.println("ArrayList Content has saved..");

        Set<String> set=new HashSet<>();
        set.add("vamana");
        set.add("parashurama");
        set.add("mathya");
        set.add("varaha");
        BufferedWriter bw1=new BufferedWriter(new FileWriter("file8.txt"));
        for (String names:set) {
            bw1.write(names);
            bw1.newLine();
        }
        bw1.close();
        System.out.println("Set content has been saved..");

        BufferedReader br=new BufferedReader(new FileReader("file7.txt"));
        BufferedReader br1=new BufferedReader(new FileReader("file8.txt"));
        String line;
        String text=new String();
        String text1=new String();
        while((line=br.readLine())!=null){
            text +=line+"\n";
            System.out.println(text);
        }
        text=text.substring(0,text.lastIndexOf("\n"));
        while ((line= br1.readLine())!=null){
            text1 +=line+"\n";
            System.out.println(text1);
        }
        text1=text1.substring(0,text1.lastIndexOf("\n"));
        br.close();
        br.close();
        String text2=text+"\n"+text1;
        BufferedWriter br2=new BufferedWriter(new FileWriter("file9.txt"));
        br2.write(text2);
        System.out.println("file created...");
        br2.flush();
        br2.close();
        String print;
        BufferedReader read=new BufferedReader(new FileReader("file9.txt"));
        while((print= read.readLine())!=null){
        System.out.println(print);
        }
        read.close();

    }
}
