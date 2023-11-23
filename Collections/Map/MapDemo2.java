package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2
{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(11,"Krishna");
        map.put(22,"Damodhara");
        map.put(33,"mohan");
        map.put(44,"govardhan");
        for (Map.Entry m:map.entrySet()) {
    System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
