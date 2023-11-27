package IOStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BufferedOutputStreamDemo1
{
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new ObjectOutputStream(new FileOutputStream("BufferedOutput.txt")));
        bos.write("CRM means Customer Relationship management".getBytes());
        System.out.println("file created..");
    bos.close();
    }
}
