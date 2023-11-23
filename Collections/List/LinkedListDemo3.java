package Collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo3
{
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        System.out.println(list);
        Iterator<String> it=  list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
