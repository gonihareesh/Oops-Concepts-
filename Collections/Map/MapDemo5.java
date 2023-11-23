package Collections.Map;

import java.util.HashMap;
import java.util.Map;

class NoteBook{
   int id;
    String name;
    String author;
    String publisher;
    double price;

    public NoteBook(int id, String name, String author, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
public class MapDemo5
{
    public static void main(String[] args) {
        Map<Integer,NoteBook> map=new HashMap<>();
        NoteBook n=new NoteBook(121,"Core java","Naresh","naresh Insitute",120);
        NoteBook n1=new NoteBook(122,"Advance java","Praveen","INetSlove Insitute",150);
        NoteBook n2=new NoteBook(123,"SalesForce","Mahesh","Durga Insitute",300);

        map.put(1,n);
        map.put(2,n1);
        map.put(3,n2);
        for (Map.Entry<Integer,NoteBook> m:map.entrySet()) {
            int id=m.getKey();
            NoteBook nb=m.getValue();
            System.out.println(id+" Details: ");
            System.out.println(nb.id+" "+nb.name+" "+nb.author+" "+nb.publisher+" "+nb.price);

        }
    }
}
