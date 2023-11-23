package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1
{
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Hari",123);
        map.put("Ramana",124);
        map.put("shiva",125);
        for (String name:map.keySet()) {
            int id= map.get(name);
            System.out.println("name "+name+" "+" id "+id);
        }
        System.out.println(map);
    }
}
