package Collections.Set;

import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("Cat");
        tree.add("Tiger");
        tree.add("Lion");
        tree.add("Dog");
        tree.add("pig");
        System.out.println("List of Elements: "+tree);
    }
}
