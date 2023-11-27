package IOStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteInputStreamDemo
{
    public static void main(String[] args) throws IOException {
        byte[] array="Hello ,How are you?".getBytes();
        ByteArrayInputStream bis=new ByteArrayInputStream(array);
        int i;
        while((i=bis.read())!=-1){
            System.out.print((char)i);
        }
        bis.close();
    }
}
