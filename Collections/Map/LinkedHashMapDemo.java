package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo
{
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("java",1);
        map.put("j2ee",2);
        map.put("servlets",3);
        map.put("Jdbc",4);
        map.put("SpringBoot",5);
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
