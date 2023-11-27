package FunctionalInterfaceandLambda;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListLambda 
{
public static void main(String[] args) {
    List<String> list=new LinkedList<>();
    list.add("rama");
    list.add("krishna");
    list.add("balarama");
    list.add("laxman");
    list.add("sita");
    list.add("radha");
    list.add("narasimha");
   
    System.out.println("Before Sorting..");
    list.forEach(n->{
        System.out.println(n);
    });
    System.out.println("After Sorting ....");
    Collections.sort(list);
    for(String s:list){
    System.out.println(s);
    }
}    
}
