package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLsitDemo6
{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        String[] name={"hari","rama","Rohan","Manish"};
        list.addAll(Arrays.asList(name));
        System.out.println(list);
    list.add("Govinda");
    list.addAll(Arrays.asList("Jagadish","Madhusudan","Kalinda","Suresh"));
    System.out.println(list);
    System.out.println(list.contains("Suresh"));
    //removing the words using Lambda Expression
        //it s.charAt(0)=='M' is checks first letter as M then it removes..
    list.removeIf(s ->s.charAt(0)=='M');
    System.out.println(list);
    }
}
