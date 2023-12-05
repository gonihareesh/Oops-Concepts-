package ExceptionHandling;

import java.io.*;

public class ExceptionDemo3
{
    public static void main(String[] args) {
        try {
            BufferedWriter br=new BufferedWriter(new FileWriter("data1.txt"));
            br.write("hello");
            br.write("How are You");
            br.write("welcome to Exception handling concept");
            br.newLine();
         br.close();
            System.out.println("file has been created..");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
