package FunctionalInterfaceandLambda;
interface Car{
    //FunctionInterface having only one abstract method.
    public int getSpeed();
}
class Audi implements Car{

    @Override
    public int getSpeed() {
        System.out.println("This is Audi car");
        return 80;
    }
}
class Tata implements Car{

    @Override
    public int getSpeed() {
        System.out.println("This is tata car.");
        return 60;
    }
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {


        Audi a = new Audi();
        System.out.println(a.getSpeed());
        Tata t = new Tata();
        System.out.println(t.getSpeed());
        //anonymous function....
        Car c=new Car() {
            @Override
            public int getSpeed() {
                return 70;
            }
        };
        System.out.println(c.getSpeed());
        //Lambda Expression with anonymous function. multi lines with Lambda function.
      /*  Car cs = () -> {
          int speed=100;
          System.out.println("This is Bmw car");
          System.out.println("This car can drive with smoothly"+speed);
          if(speed<100){
              System.out.println("slow driver");
          }else
              System.out.println("speed driver");
          return speed;
        };
System.out.println(cs.getSpeed());*/
        //if we have only one statement in our Lambda Expression we don't need to use return keyword also...
        Car c1=()-> 100;
        System.out.println(c1.getSpeed());
    }
}