package Collections.List;

import java.util.Vector;

public class VectorDemo2
{
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("Dog");
        v.add("Cat");
        v.add("Rat");
        v.add("Tiger");
        System.out.println("Elements in List: "+v.size());
        System.out.println("Initial capacity of the list: "+v.capacity());
        System.out.println("List of elements: "+v);
        if(v.contains("Tiger")){
            System.out.println("Tiger is present in the list "+v.indexOf("Tiger"));
        }
        else {
            System.out.println("Tiger is not in the list");
        }
        v.addElement("Lion");
        v.addElement("Elephant");
        System.out.println("List of Elements: "+v.size());
        System.out.println("capacity of List: "+v.capacity());
        System.out.println(v.lastElement());
        System.out.println(v.firstElement());
        System.out.println(v.hashCode());
    }
}
