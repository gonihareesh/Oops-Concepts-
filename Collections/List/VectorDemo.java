package Collections.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(11);
        v.add(12);
        v.add(65);
        v.add(4);
        v.add(9);

        Iterator<Integer> it=v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
