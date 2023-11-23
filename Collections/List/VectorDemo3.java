package Collections.List;

import java.util.Vector;

public class VectorDemo3
{
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(11);
        v.add(22);
        v.add(33);
        v.add(44);
        v.add(55);
        System.out.println("List of first Vector: "+v);
        System.out.println("                  ");
        Vector<Integer> v1=new Vector<>();
        v1.add(66);
        v1.add(77);
        v1.add(88);
        v1.add(99);
        v1.add(98);
        System.out.println("List of Second Vector: "+v1);
        System.out.println("               ");
        v.addAll(v1);
        System.out.println("List of final Vector: "+v);
    }
}
