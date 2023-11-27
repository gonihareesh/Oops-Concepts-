package InnerClasses;

 class  Main{
    abstract static class Person {
        abstract void eat();
    }

}
public class AbstractInner  {
    public static void main(String[] args) {
        Main.Person p = new Main.Person() {

            @Override
            void eat() {
                System.out.println("person can eat 3 times in a day");
            }
        };
        p.eat();
    }
}
