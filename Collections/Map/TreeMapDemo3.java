package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

class Paper{
    int pages;
    String size;
    String color;

    public Paper(int pages, String size, String color) {
        this.pages = pages;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "pages=" + pages +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
public class TreeMapDemo3 {
    public static void main(String[] args) {
        Map<Integer,Paper> map=new TreeMap<>();
       Paper p= new Paper(200,"A4 Size","White");
        Paper p1=new Paper(300,"A6 size","Brown");
        Paper p2=new Paper(140,"A4","black");
        map.put(1,p);
        map.put(3,p2);
        map.put(2,p1);
        for (Map.Entry<Integer,Paper> m:map.entrySet()) {
        int id=m.getKey();
        Paper paper=m.getValue();
        System.out.println(paper.pages+" "+paper.size+" "+paper.color);
        }
    }

}
