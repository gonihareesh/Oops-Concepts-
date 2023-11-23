package Collections.Map;

import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2
{
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>();
        map.put(101,"Biryani");
        map.put(102,"Pulav");
        map.put(103,"roti");
        map.put(104,"Manchuria");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.putIfAbsent(105,"Samosa"));
        System.out.println(map);
        System.out.println(map.containsValue("roti"));


    }
}
