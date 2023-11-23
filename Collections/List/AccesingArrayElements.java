package Collections.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AccesingArrayElements
{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        System.out.println("is topCompanies list empty:"+list.isEmpty());
        list.add("Google");
        list.add("Apple");
        list.add("Microsoft");
        list.add("Amazon");
        list.add("Walmart");

    System.out.println("here is the top "+list.size()+" companies in the word");
        System.out.println(list);
        //Returns the element at the specified position in this list.
        String bestCompany=list.get(0);
        String secondCompany=list.get(1);
        String lastcompany=list.get(list.size()-1);
        System.out.println("Best Company is :"+bestCompany);
        System.out.println("second best Company is :"+secondCompany);
        System.out.println("last company is :"+lastcompany);
        //Replaces the element at the specified position in this list with the specified element
        System.out.println(list.set(4,"Lenovo"));
        System.out.println(list);
    }
}
