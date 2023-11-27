package IOStreams;

import java.io.*;

public class BufferedOutputStreamDemo
{
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bof=new BufferedOutputStream(new FileOutputStream("Bof.txt"));
        bof.write("Java is a simple language\n".getBytes());
        bof.write("java is easy to learn \n".getBytes());
        System.out.println("file created successfully");
        bof.close();
    }
}
