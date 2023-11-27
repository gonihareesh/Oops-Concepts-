package FunctionalInterfaceandLambda;


interface Circle{
    int value();
}

public class FunctionInterfaceExample {
    
    public static void main(String[] args) {
        //lambda expression using in functional interface...
        Circle c=()->{
            return 10;

        };
        System.out.println("value:"+c.value());
    }
}
