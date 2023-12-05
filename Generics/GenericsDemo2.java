package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("drawing Rectangle");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("drawing circle");
    }
}

public class GenericsDemo2
{
    //WildCard
    public static void drawShape(List<? extends Shape> list){
        for (Shape s:list) {
            s.draw();
        }
    }
    public static void main(String[] args) {
    List<Rectangle> rc=new ArrayList<>();
    rc.add(new Rectangle());
    drawShape(rc);
    List<Circle> c=new ArrayList<>();
    c.add(new Circle());
    drawShape(c);
    }
}
