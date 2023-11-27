package IOStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo
{
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("demo1.txt");
        int i=0;
        while ((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        fis.close();
    }
}
