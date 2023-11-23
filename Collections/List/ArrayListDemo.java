package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;

record GroseriesItems(String product,int count,String type){

    GroseriesItems(String product) {
        this(product,6,"Dairy");
    }
}
public class ArrayListDemo
{
    public static void main(String[] args) {
        Object[] getingintems=new Object[3];

        getingintems[0]=new GroseriesItems("Milk",2,"Dairy");
        getingintems[1]=new GroseriesItems("Curd",3,"Dairy");
        getingintems[2]=new GroseriesItems("Chocolet",1,"DairyMilk");
    System.out.println(Arrays.toString(getingintems));
    ArrayList<GroseriesItems> array=new ArrayList<GroseriesItems>();
    array.add(new GroseriesItems("Ice-cream",1,"Natural"));
   System.out.println(array);
    }
}
