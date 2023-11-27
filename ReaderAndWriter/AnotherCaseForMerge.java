package ReaderAndWriter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AnotherCaseForMerge
{
    public static void main(String[] args) throws IOException {

        Map<String, String> nameMap = new HashMap<>();
        Map<String, String> emailMap = new HashMap<>();
        Map<String, String> phoneMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("file10.csv"));
        String text = br.readLine();
        while ((text = br.readLine()) != null) {
            String[] parts = text.split(",");
            String id = parts[0];
            String name = parts[1];
            nameMap.put(id, name);
        }
        br.close();
        BufferedReader br2 = new BufferedReader(new FileReader("file11.csv"));
        text = br2.readLine();
        while ((text = br2.readLine()) != null) {
            String[] parts = text.split(",");
            String id = parts[0];
            String email = parts[1];
            emailMap.put(id, email);
        }
        br2.close();
        BufferedReader br3 = new BufferedReader(new FileReader("file12.csv"));
        text = br3.readLine();
        while ((text = br3.readLine()) != null) {
            String[] parts = text.split(",");
            String id = parts[0];
            String salary = parts[1];
            phoneMap.put(id, salary);
        }
        br3.close();
        BufferedWriter bwrite = new BufferedWriter(new FileWriter("demo5.csv"));
        bwrite.write("id,name,eMail,salary\n");
        for (String id : nameMap.keySet()) {
            if (emailMap.containsKey(id) && phoneMap.containsKey(id)) {
                String name = nameMap.get(id);
                String eMail = emailMap.get(id);
                String salary = phoneMap.get(id);
                bwrite.write(id + "," + name + "," + eMail + "," + salary);
                bwrite.newLine();
            }
        }
        bwrite.close();
        System.out.println("merg file is created..");
        BufferedReader br4=new BufferedReader(new FileReader("demo5.csv"));
        while((text=br4.readLine())!=null){
            System.out.println(text);
        }
    }
}
