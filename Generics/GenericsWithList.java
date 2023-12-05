package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWithList
{
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("salesforce");
        list.add("Dotnet");
        for (String s:list) {
            System.out.println(s);
        }
    }
}
