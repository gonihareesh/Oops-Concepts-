package IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo
{
    public static void main(String[] args) throws IOException {

        FileOutputStream fos=new FileOutputStream("fos.txt");
       fos.write("Java\n".getBytes());
       fos.write("Python\n".getBytes());
       fos.write("Devops\n".getBytes());
       fos.write("SalesForce\n".getBytes());
       System.out.println("file has been created..");

    }
}
