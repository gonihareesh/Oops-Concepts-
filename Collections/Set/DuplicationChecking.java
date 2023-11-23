package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Set does not allow duplicate values it prints only once..
//HashSet does not fellow insertion order
public class DuplicationChecking
{
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("rama");
        set.add("Ravi");
        set.add("Mohan");
        set.add("Ravi");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
