package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//LinkedHashSet fellow insertion order..

public class MergLinkedHashSet
{
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(12);
        set.add(24);
        set.add(36);
        set.add(48);
        System.out.println(set);

        Set<Integer> s=new LinkedHashSet<>();
        s.add(60);
        s.add(72);
        s.add(84);
        s.add(96);
        System.out.println(s);

        set.addAll(s);
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
