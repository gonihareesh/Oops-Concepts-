package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap<>();
        map.put(11,"Lenovo");
        map.put(22,"Dell");
        map.put(33,"Hp");
        map.put(44,"Asus");
        map.put(55,"redmi");
        map.put(66,"Dell");
        map.put(77," ");
        map.put(77,"Thikpad");
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
