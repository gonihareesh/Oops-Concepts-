package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo
{
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("Rama");
        set.add("Laxman");
        set.add("Sita");
        set.add("bharata");
        set.add("shatrugnya");
        System.out.println(set);
        System.out.println(set.size());
        set.remove("shatrugnya");
        System.out.println(set);
        set.add("Hanuman");
        set.add("Urmila");
        System.out.println(set);
    }
}
