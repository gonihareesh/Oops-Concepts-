package Collections.Set;

import java.util.*;

public class LinkedHAshSetDemo2
{
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.addAll(Arrays.asList(1,3,45,12,7,98,22,65));
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        Set<Integer> s=new HashSet<>();
        s.add(11);
        s.add(17);
        s.add(15);
        s.add(23);
        set.addAll(s);
        //unSorted list...
        System.out.println("unsorted list: "+set);
        //converting Set to List. Because we can not use Sorting directly in Set bcoz Set is unorderd Collection..
        List<Integer> list=new LinkedList<>(set);
        Collections.sort(list);
        //converting List to Set
        set=new LinkedHashSet<>(list);
        System.out.println("Sorted list: "+set);

    }
}
