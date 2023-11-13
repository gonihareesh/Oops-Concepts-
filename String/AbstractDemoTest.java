package OOps;

import java.util.ArrayList;

public class AbstractDemoTest
{
    public static void main(String[] args) {
        Dogs dog=new Dogs("wolf","Big",100);
        dog.makeNoice();
    //    dog.move("fast");
    doAnimalStaff(dog);
    ArrayList<AbstractDemo> ani=new ArrayList<>();
    ani.add(new Dogs("Germen Shepyard","big",100));
    ani.add(new Fish("Gold Fish","small",10));
    ani.add(new Fish("teena","medium",15));
    ani.add(new Dogs("Normal dog","small",10));
        for (AbstractDemo animal:ani) {
            doAnimalStaff(animal);
        }
    }
public static void doAnimalStaff(AbstractDemo animal){
        animal.makeNoice();
        animal.move("slow");
}


}
