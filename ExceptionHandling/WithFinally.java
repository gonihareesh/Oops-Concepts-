package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithFinally
{
    public static void main(String[] args){

        try (BufferedReader br=new BufferedReader(new FileReader("data1.txt"))){
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            System.out.println("An error occurred while reading the file");
        }

    }
}
