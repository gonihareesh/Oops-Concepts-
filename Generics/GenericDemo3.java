package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo3
{
    //unbounding wildCards
    public static void display(List<?> list)
    {
        for (Object o:list) {
    System.out.println(o);
        }

    }
    public static void main(String[] args) {
    List<Integer> li= Arrays.asList(1,2,3);
    System.out.println("list of Integer values: ");
    display(li);
    List<String> ls=Arrays.asList("Krishna","RamaChandra","Hanuman");
    System.out.println("List of String values ");
    display(ls);
    }
}
