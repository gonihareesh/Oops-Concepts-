package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo3
{
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"ramana");
        map.put(2,"sandeep");
        map.put(3,"charan");
        map.put(4,"sree ram");
        System.out.println(map+"\t\n");
        Map<Integer,String> map1=new LinkedHashMap<>();
        map1.put(5,"digamber");
        map1.put(6,"srikanth");
        map1.put(7,"rajesh");
        map1.put(8,"shiva");
        System.out.println(map1);
        map.putAll(map1);
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
