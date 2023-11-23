package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHAshMapDemo2
{
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(12,"krishna");
        map.put(13,"yashodaNandan");
        map.put(14,"Vasudev");
        map.put(16,"DwarakaDish");
        if(map.containsKey(15)){
            System.out.println("value of given key "+map.get(16));
        }else{
            System.out.println("Value does not exist ");
            map.put(15,"Gopal");
        }
        System.out.println("Elements of Map are ");
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
