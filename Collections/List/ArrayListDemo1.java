package Collections.List;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo1
{
    public static void main(String[] args) {
        //ArrayList initial capacity is 10....
        ArrayList <String> al=new ArrayList<>();
        al.add("java");
        al.add("is");
        al.add("more");
        al.add("easy");
        al.add("programme");
        al.add("language");
        al.add("and");
        al.add("Simple");
        al.add("Programe Language");
        al.add("and also ");
        al.add("Roboust");
        for (String ar:al) {
            System.out.print(ar+" ");
        }
    }
}
