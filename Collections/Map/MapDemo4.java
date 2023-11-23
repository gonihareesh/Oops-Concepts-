package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4
{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(11,"Harish");
        map.put(12,"Sandeep");
        map.put(13,"Vinay");
        map.put(14,"Ramesh");
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.replace(14,"digambar");
        System.out.println("After update the value");
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
map.remove(12);
        System.out.println("After removing one element");
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
