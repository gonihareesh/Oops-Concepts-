package IOStreams;

import java.io.*;

public class ByteStreamDemo
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("file1.txt");
        FileOutputStream fo=new FileOutputStream("file2.txt");
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write("Human birth is greatest gift for chant Lord name".getBytes());
        baos.writeTo(fos);
        baos.writeTo(fo);
        fos.close();
        fo.close();
        baos.close();
        System.out.println("file successfully created");
    }
}
