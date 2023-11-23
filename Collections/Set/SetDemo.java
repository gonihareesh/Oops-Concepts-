package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Sree Ram");
        set.add("Sree Krishna");
        set.add("Sree Narasimha");
        set.add("Sree vamana");
        System.out.println(set);
        System.out.println(set.size());
        Iterator<String> it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
