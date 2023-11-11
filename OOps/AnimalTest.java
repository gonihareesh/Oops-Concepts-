package OOps;

public class AnimalTest
{
    public static void main(String[] args) {
    Animal ani=new Animal("French Bulldog","medium",400);
    AnimalTest.doAnimalStaff(ani,"Fast");

    for(int i=1;i<=10000;i*=10){
        System.out.println("Printing \\d \\n: "+i);
    }

    Dog d=new Dog();
    doAnimalStaff(d,"slow");
    }
    public static void doAnimalStaff(Animal animal,String speed){
        animal.makeNoice();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("--------");
    }
}
