package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arraymerge {
    public static void main(String[] args) throws IOException{
        ArrayList<String> al=new ArrayList<>();
        al.add("hello");
        al.add("welcome to the developer");
        BufferedWriter bw=new BufferedWriter(new FileWriter("arraydemomerg.csv"));
        for(String d:al){
        bw.write(d);
        bw.newLine();
System.out.println("file is created....");
        }
        bw.close();
BufferedReader br=new BufferedReader(new FileReader("arraydemomerg.csv"));
String line;
while((line=br.readLine())!=null){
    System.out.println(line);
}

br.close();

    }
    
}
