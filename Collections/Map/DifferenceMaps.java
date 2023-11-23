package Collections.Map;

import java.util.*;

public class DifferenceMaps
{
    public static void main(String[] args) {
        //HashMap does not maintain any order...
        Map<Integer, String> map = new HashMap<>();
        map.put(6,"Six");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five" );
        System.out.println("HashMap: " + map);
//LinkedHashMap maintain insertion order..
        Map<Integer, String> map1 = new LinkedHashMap<>();
        Map<Integer,String> synch= Collections.synchronizedMap(map1);
        map1.put(6,"Six");
        map1.put( 1,"One");
        map1.put(2,"Two");
        map1.put(3,"Three");
        map1.put(4,"Four");
        map1.put(5,"Five" );
        System.out.println("LinkedHashMap: " + map1);
//TreeMap maintains ascending order.
        Map<Integer,String > map2 = new TreeMap<>();
        map2.put(6,"Six");
        map2.put( 1,"One");
        map2.put(2,"Two");
        map2.put(3,"Three");
        map2.put(4,"Four");
        map2.put(5,"Five" );
        System.out.println("TreeMap: " + map2);
    }
}
