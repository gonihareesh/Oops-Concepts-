package Collections.List;

import java.util.ArrayList;

public class ArrayListMethods
{
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(16);
        System.out.println(al.size());//calculating the size of array
        System.out.println(al+" ");
        System.out.println(al.contains(12));//check for which we entered is contains or not it returns boolean value
        System.out.println(al.remove(3));//removing the specific index position
        System.out.println(al+" ");
        System.out.println(al.get(0));//getting the index position of Array
        System.out.println(al.lastIndexOf(16));//which we entred element in having which index position...
        al.clear();

        System.out.println(al);
    }
}
