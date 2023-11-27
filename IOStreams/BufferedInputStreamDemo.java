package IOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo
{
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Bof.txt"));
        int i;
        while((i=bis.read())!=-1){
            System.out.print((char) i);
        }
        bis.close();
    }
}
