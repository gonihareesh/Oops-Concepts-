package IOStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1
{
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");
        int i=0;
        while((i=fis.read())!=-1){
            System.out.print((char)i);

        }
        fis.close();
    }
}
