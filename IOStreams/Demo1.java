package IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1
{
    public static void main(String[] args) throws IOException {
        //FileOutputStream is an output stream used for writing data to a file
        FileOutputStream fop=new FileOutputStream("demo1.txt");

        fop.write("Java is simple language\n".getBytes());
        fop.write("Java is Independent Language\n".getBytes());
        fop.write("java is secured Language\n".getBytes());


        System.out.println("file has been saved...");
    }
}
