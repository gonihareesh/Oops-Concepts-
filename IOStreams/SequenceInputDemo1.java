package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputDemo1
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("first.txt");
        fos.write("Java\n".getBytes());
        fos.write("J2EE\n".getBytes());
        fos.write("Servlets\n".getBytes());
        System.out.println("First file created..");
        fos.close();

        FileOutputStream fos1=new FileOutputStream("Second.txt");
        fos1.write("SQL\n".getBytes());
        fos1.write("Oracle\n".getBytes());
        fos1.write("MongoDB\n".getBytes());
        System.out.println("Second file created..");
        fos1.close();

        FileInputStream fis=new FileInputStream("first.txt");
        FileInputStream fi=new FileInputStream("Second.txt");
        SequenceInputStream sis=new SequenceInputStream(fis,fi);
        int i;
        while ((i=sis.read())!=-1){
            System.out.print((char) i);
        }
        fis.close();
        fi.close();
        sis.close();
    }


}
