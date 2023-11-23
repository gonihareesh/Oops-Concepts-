package Collections.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//adding two ArrayList into Single List....
public class MoreList
{
    public static void main(String[] args) {
        String[] items={"apples","banana","oranges","litchi"};
        List<String> fruits= List.of(items);

        System.out.println(fruits);
        ArrayList<String> list=new ArrayList<>(fruits);
        list.add("mango");
        System.out.println(list);
        ArrayList<String> moreList=new ArrayList<>(
                List.of("curd","milk","panner"));
        System.out.println(moreList);
        list.addAll(moreList);
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);



    }
}
