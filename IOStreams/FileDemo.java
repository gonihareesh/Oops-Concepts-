package IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("demo.txt");
        fos.write("java is everything".getBytes());//converting string to byte
        fos.write(23);

        fos.close();
        System.out.println("file has created...");

    }
}
