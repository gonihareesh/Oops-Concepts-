package Collections.Set;

import java.util.*;

public class SortedSet
{
    public static void main(String[] args) {
        Set<Integer> list=new HashSet<>();
        list.add(14);
        list.add(5);
        list.add(8);
        list.add(24);
        list.add(12);
        list.add(1);
        System.out.println("UnSorted list of elements: "+list);
        List<Integer> lists=new ArrayList<>(list);
        Collections.sort(lists);
        list=new LinkedHashSet<>(lists);//converting List to set
System.out.println("After Sorted the list of Elements: "+list);
    }
}
