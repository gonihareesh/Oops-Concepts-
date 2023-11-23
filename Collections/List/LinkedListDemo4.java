package Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo4
{
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("allow Duplication");
        list.add("allow Null values");
        list.add("not synchronized");
        System.out.println(list);
        ArrayList<String> al=new ArrayList<>();
        al.add("Al Allows Duplication");
        al.add("al allows Null values");
        al.add("al is not synchronized");
        System.out.println(al);
        //set() is used to replace an element at the specified index position.
        list.set(1,"LinkedList is allow Null values");
        list.set(2,"LinkedList is not synchronized");
        //append all elemnets into the list
        list.addAll(al);
        System.out.println(list);
        //last occurrence of the specified element in this list
        System.out.println(list.lastIndexOf("al allows Null values"));
        //count of the number of elements in the list
        System.out.println(list.size());
        //getting specified index position
        System.out.println(list.get(5));
        System.out.println(list.set(0,"LinkedList is allow Duplicates"));
        System.out.println(list);
        ((LinkedList<String>) list).addFirst("java");
        System.out.println(list);


    }
}
