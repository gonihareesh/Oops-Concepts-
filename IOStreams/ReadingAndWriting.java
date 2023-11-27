package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingAndWriting {
    public static void main(String[] args) throws IOException {
        //writing data into the file...
        FileOutputStream fos=new FileOutputStream("combination.txt");
        fos.write("FileOutputStream is output Stream it is used to store data in to the files.\n".getBytes());
        fos.write("FileInputStream is input Stream which is used to read data from file.".getBytes());
        System.out.println("File created..");
        fos.close();
//reading data from file.
        FileInputStream fis=new FileInputStream("combination.txt");
        int i;
        while((i=fis.read())!=-1){
            System.out.print((char) i);
        }
    }

}
