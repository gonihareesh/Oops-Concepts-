package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3
{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Rama");
        map.put(102,"Laxman");
        map.put(103,"Sita");
        System.out.println("before putIfAbsent");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(104,"urmila");
        System.out.println("After putIfAbsent method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(100,"Hanuman");
        map.putAll(map1);
        System.out.println("After Merge Two Maps");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
