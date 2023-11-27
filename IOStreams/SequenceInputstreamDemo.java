package IOStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputstreamDemo
{
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("combination.txt");
        FileInputStream fis=new FileInputStream("demo1.txt");

        SequenceInputStream sis=new SequenceInputStream(fi,fis);
        int i;
        while((i=sis.read())!=-1){
            System.out.print((char)i);
        }
    }
}
