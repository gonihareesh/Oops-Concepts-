package Collections.List;

import java.util.ArrayList;

public class SizeOfArray
{
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.ensureCapacity(20);
        array.add("rama");
        array.add("hari");
        array.add("vishnu");
        array.add("narasimha");
        array.add("vamana");
        array.add("hygriva");
        array.add("matya");
        array.add("kurma");
        array.add("kalki");
        System.out.println(array.size());
        System.out.println("List of Arrays is:"+array);
        array.trimToSize();


    }
}
