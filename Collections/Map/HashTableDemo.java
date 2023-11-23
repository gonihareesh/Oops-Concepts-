package Collections.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo
{
    public static void main(String[] args) {
        Hashtable<Integer,String> table=new Hashtable<>();
        table.put(11,"one");
        table.put(12,"Two");
        table.put(13,"three");
        table.put(14,"four");
        //Enumeration interface provides methods to iterate over a collection of objects
        //It is mainly associated with  Vector and Hashtable
        Enumeration e=table.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
