package OOps;

interface Walkable{
    abstract void walk();
}
interface Swimmable{
    abstract void swim();
}
class Duck implements Walkable,Swimmable{

    @Override
    public void walk() {
        System.out.println("Duck can walk long time");
    }

    @Override
    public void swim() {
System.out.println("Duck can swim long time");
    }
}


public class MultipulInheritance {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.swim();
        d.walk();
    }
}
