package FunctionalInterfaceandLambda;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Mobile{
 int cost;
 String modelName;
 String companyName;
 String ram;
public Mobile(int cost, String modelName, String companyName, String ram) {
    this.cost = cost;
    this.modelName = modelName;
    this.companyName = companyName;
    this.ram = ram;
}
 
}
public class CollectionInterface {
    public static void main(String[] args) {
        List<Mobile> list=new LinkedList<>();
    list.add(new Mobile(12999, "RedmiNote 12 ", "Mi", "6GB"));
    list.add(new Mobile(31999, "RedmiNote 12 pro plus", "MI", "12GB"));
    list.add(new Mobile(32999, "nordge 7 pro", "IQ00", "12GB"));
    list.add(new Mobile(30999, "Moto G7 5g", "Motorola", "12GB"));
    Collections.sort(list,(p1,p2)->{
return p1.modelName.compareTo(p2.modelName);
    });
    for(Mobile m:list){
        System.out.println(m.companyName+" "+m.modelName+" "+m.cost);
    }
List<Integer> listStream=list.stream().filter(p->p.cost<20000)  //it filters the list...
.map(p->p.cost)//map method is used to return a stream consisting of the results of applying
.collect(Collectors.toList());

System.out.println(listStream);

    }
    
}
